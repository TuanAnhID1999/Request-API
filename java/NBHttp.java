import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

final class NBHttp {

    static final String MOBILE_USER_AGENT = "Mozilla/5.0 (Linux; Android 5.1.1; Nexus 5 Build/LMY48B; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/43.0.2357.65 Mobile Safari/537.36";
    static final String DESKTOP_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36";

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
            .connectTimeout(50, TimeUnit.SECONDS)
            .readTimeout(50, TimeUnit.SECONDS)
            .build();


    private static CompletableFuture<Response> getResponse(String url, String userAgent, Executor executor) {
        return CompletableFuture.supplyAsync(new Supplier<Response>() {
            @Override
            public Response get() {
                try {
                    return okHttpClient.newCall(new Request.Builder()
                            .url(url)
                            .header("User-Agent", userAgent != null ? userAgent : MOBILE_USER_AGENT)
                            .get()
                            .build())
                            .execute();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
    }


    static CompletableFuture<String> getString(String url) {
        return getResponse(url, null, null).thenApplyAsync(new Function<Response, String>() {
            @Override
            public String apply(Response response) {
                String body = "";
                try {
                    int statusCode = response.code();
                    if (statusCode == 200) {
                        if (response.body() != null) {
                            body = response.body().string();
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    if (response.body() != null) {
                        response.body().close();
                    }
                }

                return body;
            }
        });
    }


}

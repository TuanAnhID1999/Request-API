import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

class Main {

    static List<AdUnit> adUnits = new ArrayList<>();
    static List<AppGroup> appGroups = new ArrayList<>();

    public static void main(String[] args) {



        NBHttp.getString(Constant.API_APP_GROUP).thenApplyAsync(new Function<String, List<AppGroup>>() {
            @Override
            public List<AppGroup> apply(String response) {

                // TODO: Parse json string to list AppGroup
                Gson gson = new Gson();
                List<AppGroup> appGroups1;
                Type type = new TypeToken<List<AppGroup>>() {
                }.getType();
                appGroups1 = gson.fromJson(response, type);
                appGroups.addAll(appGroups1);
                for (int i = 0; i < appGroups.size(); i++) {
                    System.out.println(appGroups.get(i).getApps());
                }

                //System.out.println(response);
                return appGroups1;
            }
        }).thenApplyAsync(new Function<List<AppGroup>, String>() {

            @Override
            public String apply(List<AppGroup> appGroups) {

                List<AdUnit> adUnits = fetchAdUnit("item");
                System.out.println(adUnits.get(0).getAdUnitName() + " tên");
                System.out.println(adUnits.get(1).getAdUnitName() + "tên 2");
                sumAdUnit();


                // TODO: Request App Build email content
                return new EmailBuilder().buildEmail();
            }
        })
                .thenApplyAsync(new Function<String, Object>() {
                    @Override
                    public Object apply(String emailContent) {
                        // TODO: Send email
                        new EmailSender().send(emailContent);
                        return null;
                    }
                }).
                join();


    }

    // Lấy dữ liệu của item
    public static List<AdUnit> fetchAdUnit(String packageName) {


        NBHttp.getString(Constant.getAdUnitApi(packageName)).thenApplyAsync(new Function<String, Object>() {
            @Override
            public Object apply(String response) {
                try {
                    AdApp adApps = new Gson().fromJson(response, AdApp.class);
                    adUnits.addAll(adApps.getItems());

                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }

                return adUnits;
            }
        }).join();

        return adUnits;
    }

    public static void sumAdUnit() {
        List<AdUnit> adUnitsSum = new ArrayList<>();
        for ( AdUnit adUnit: adUnits){
//            if (adUnit.getAdUnitName().equals(Constant.MSC_UNIT_IDS)){
//
//            }
            if (adUnit.getAdUnitName().equals("nt_message")){
                System.out.println(adUnit.getEarnings()+ " Tiền");
            }
        }
    }

    public static void totalAdUnit() {
        for ( AdUnit adUnit: adUnits){

        }

    }


}

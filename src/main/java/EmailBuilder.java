import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class EmailBuilder {

    public String buildEmail(){
        System.out.println("Start build email");
        return getContentFromResource("test.html")
                .replace("_title_colume_", "Package Name");
    }

   private String getContentFromResource(String fileName) {
        StringBuilder content = new StringBuilder();

       InputStream ins = this.getClass().getResourceAsStream("/"+fileName);
       BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
        String str;
       try {
           while ((str = reader.readLine()) != null) {
               content.append(str);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

       return content.toString();
    }
}

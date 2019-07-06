import java.util.Arrays;
import java.util.List;

class Constant {
    public static final String API_APP_GROUP = "https://pastebin.com/raw/2F8vCFrw";
    public static final String API_AD_UNIT = "https://pastebin.com/raw/R8S7wEjw";

    public static final List<String> MSC_UNIT_IDS= Arrays.asList("nt_message_center", "nt_message");


    public static final float WARNING_EARNING = 20;
    public static final float WARNING_ECPM = 2.5f;
    public static final float WARNING_FILL_RATE = 50;
    public static final float WARNING_SHOW_RATE = 50;

    public static String getAdUnitApi(String appId){
        return API_AD_UNIT;
    }
}

import com.google.gson.annotations.SerializedName;




public class AdTotal {
    @SerializedName("date")
    private String date;

    @SerializedName("ctr")
    private double ctr;

    @SerializedName("fill_rate")
    private double fillRate;

    @SerializedName("impressions")
    private int impressions;

    @SerializedName("ad_requests")
    private int adRequests;

    @SerializedName("filled_ad_requests")
    private int filledAdRequests;

    @SerializedName("show_rate")
    private double showRate;

    @SerializedName("ad_unit_id")
    private String adUnitId;

    @SerializedName("earnings")
    private double earnings;

    @SerializedName("ecpm")
    private double ecpm;

    @SerializedName("ad_unit_name")
    private String adUnitName;

    @SerializedName("clicks")
    private int clicks;

    @SerializedName("app_id")
    private String appId;

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setCtr(double ctr){
        this.ctr = ctr;
    }

    public double getCtr(){
        return ctr;
    }

    public void setFillRate(double fillRate){
        this.fillRate = fillRate;
    }

    public double getFillRate(){
        return fillRate;
    }

    public void setImpressions(int impressions){
        this.impressions = impressions;
    }

    public int getImpressions(){
        return impressions;
    }

    public void setAdRequests(int adRequests){
        this.adRequests = adRequests;
    }

    public int getAdRequests(){
        return adRequests;
    }

    public void setFilledAdRequests(int filledAdRequests){
        this.filledAdRequests = filledAdRequests;
    }

    public int getFilledAdRequests(){
        return filledAdRequests;
    }

    public void setShowRate(double showRate){
        this.showRate = showRate;
    }

    public double getShowRate(){
        return showRate;
    }

    public void setAdUnitId(String adUnitId){
        this.adUnitId = adUnitId;
    }

    public String getAdUnitId(){
        return adUnitId;
    }

    public void setEarnings(double earnings){
        this.earnings = earnings;
    }

    public double getEarnings(){
        return earnings;
    }

    public void setEcpm(double ecpm){
        this.ecpm = ecpm;
    }

    public double getEcpm(){
        return ecpm;
    }

    public void setAdUnitName(String adUnitName){
        this.adUnitName = adUnitName;
    }

    public String getAdUnitName(){
        return adUnitName;
    }

    public void setClicks(int clicks){
        this.clicks = clicks;
    }

    public int getClicks(){
        return clicks;
    }

    public void setAppId(String appId){
        this.appId = appId;
    }

    public String getAppId(){
        return appId;
    }

    @Override
    public String toString(){
        return
                "Total{" +
                        "date = '" + date + '\'' +
                        ",ctr = '" + ctr + '\'' +
                        ",fill_rate = '" + fillRate + '\'' +
                        ",impressions = '" + impressions + '\'' +
                        ",ad_requests = '" + adRequests + '\'' +
                        ",filled_ad_requests = '" + filledAdRequests + '\'' +
                        ",show_rate = '" + showRate + '\'' +
                        ",ad_unit_id = '" + adUnitId + '\'' +
                        ",earnings = '" + earnings + '\'' +
                        ",ecpm = '" + ecpm + '\'' +
                        ",ad_unit_name = '" + adUnitName + '\'' +
                        ",clicks = '" + clicks + '\'' +
                        ",app_id = '" + appId + '\'' +
                        "}";
    }


}

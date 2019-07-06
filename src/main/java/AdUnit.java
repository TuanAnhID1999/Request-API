import com.google.gson.annotations.SerializedName;




class AdUnit {
    @SerializedName("date")
    private String date;

    @SerializedName("ctr")
    private double ctr;

    @SerializedName("fill_rate")
    private double fillRate;

    @SerializedName("earnings")
    private double earnings;

    @SerializedName("ecpm")
    private double ecpm;

    @SerializedName("ad_unit_name")
    private String adUnitName;

    @SerializedName("clicks")
    private int clicks;

    @SerializedName("impressions")
    private int impressions;

    @SerializedName("ad_requests")
    private int adRequests;

    @SerializedName("filled_ad_requests")
    private int filledAdRequests;

    @SerializedName("show_rate")
    private double showRate;

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

    @Override
    public String toString(){
        return
                "ItemsItem{" +
                        "date = '" + date + '\'' +
                        ",ctr = '" + ctr + '\'' +
                        ",fill_rate = '" + fillRate + '\'' +
                        ",earnings = '" + earnings + '\'' +
                        ",ecpm = '" + ecpm + '\'' +
                        ",ad_unit_name = '" + adUnitName + '\'' +
                        ",clicks = '" + clicks + '\'' +
                        ",impressions = '" + impressions + '\'' +
                        ",ad_requests = '" + adRequests + '\'' +
                        ",filled_ad_requests = '" + filledAdRequests + '\'' +
                        ",show_rate = '" + showRate + '\'' +
                        "}";
    }
}

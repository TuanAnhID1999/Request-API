import java.util.ArrayList;

import java.util.List;

import com.google.gson.annotations.SerializedName;



public class AdApp{

    @SerializedName("end_date")
    private String endDate;

    @SerializedName("total")
    private AdTotal total;

    @SerializedName("items")
    private List<AdUnit> items;

    @SerializedName("start_date")
    private String startDate;

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public AdTotal getTotal() {
        return total;
    }

    public void setTotal(AdTotal total) {
        this.total = total;
    }

    public List<AdUnit> getItems() {
        return items;
    }

    public void setItems(List<AdUnit> items) {
        this.items = items;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getStartDate(){
        return startDate;
    }

    @Override
    public String toString(){
        return
                "Data{" +
                        "end_date = '" + endDate + '\'' +
                        ",total = '" + total + '\'' +
                        ",items = '" + items + '\'' +
                        ",start_date = '" + startDate + '\'' +
                        "}";
    }
}
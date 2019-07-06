import java.util.ArrayList;
import java.util.List;

class AppGroup {

    private String nameGroup;
    private String id;
    private List<String> apps;

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    public List<String> getApps() {
        return apps;
    }

}

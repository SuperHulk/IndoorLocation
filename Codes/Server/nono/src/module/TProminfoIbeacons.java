package module;

public class TProminfoIbeacons {
    private String storeno;

    private String prominfoid;

    private String ibeaconid;

    public String getStoreno() {
        return storeno;
    }

    public void setStoreno(String storeno) {
        this.storeno = storeno == null ? null : storeno.trim();
    }

    public String getProminfoid() {
        return prominfoid;
    }

    public void setProminfoid(String prominfoid) {
        this.prominfoid = prominfoid == null ? null : prominfoid.trim();
    }

    public String getIbeaconid() {
        return ibeaconid;
    }

    public void setIbeaconid(String ibeaconid) {
        this.ibeaconid = ibeaconid == null ? null : ibeaconid.trim();
    }
}
package module;

public class TStoreIbeacons {
    private String storeno;

    private String ibeaconid;

    public String getStoreno() {
        return storeno;
    }

    public void setStoreno(String storeno) {
        this.storeno = storeno == null ? null : storeno.trim();
    }

    public String getIbeaconid() {
        return ibeaconid;
    }

    public void setIbeaconid(String ibeaconid) {
        this.ibeaconid = ibeaconid == null ? null : ibeaconid.trim();
    }
}
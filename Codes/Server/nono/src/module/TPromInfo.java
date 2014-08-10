package module;

public class TPromInfo {
    private String prominfoid;

    private String storeno;

    private String description;

    private String adimage;

    public String getProminfoid() {
        return prominfoid;
    }

    public void setProminfoid(String prominfoid) {
        this.prominfoid = prominfoid == null ? null : prominfoid.trim();
    }

    public String getStoreno() {
        return storeno;
    }

    public void setStoreno(String storeno) {
        this.storeno = storeno == null ? null : storeno.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAdimage() {
        return adimage;
    }

    public void setAdimage(String adimage) {
        this.adimage = adimage == null ? null : adimage.trim();
    }
}
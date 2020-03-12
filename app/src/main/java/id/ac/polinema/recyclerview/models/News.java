package id.ac.polinema.recyclerview.models;

public class News {
    public String logonews;
    public String stasiun;
    public String beritanya;

    public News(String logonews, String stasiun, String beritanya) {
        this.logonews = logonews;
        this.stasiun = stasiun;
        this.beritanya = beritanya;
    }

    public String getLogonews() {
        return logonews;
    }

    public void setLogonews(String logonews) {
        this.logonews = logonews;
    }

    public String getStasiun() {
        return stasiun;
    }

    public void setStasiun(String stasiun) {
        this.stasiun = stasiun;
    }

    public String getBeritanya() {
        return beritanya;
    }

    public void setBeritanya(String beritanya) {
        this.beritanya = beritanya;
    }
}

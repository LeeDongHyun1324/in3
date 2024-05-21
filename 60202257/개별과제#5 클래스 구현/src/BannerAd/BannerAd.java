package BannerAd;

public class BannerAd {
    private String adName;
    private String adImg;
    private String adUrl;
    private boolean adCompatibility;

    public BannerAd(String adName, String adImg, String adUrl, boolean adCompatibility) {
        this.adName = adName;
        this.adImg = adImg;
        this.adUrl = adUrl;
        this.adCompatibility = adCompatibility;
    }

    public void showAd() {
        System.out.println("배너 광고 표시: " + adName + ", 이미지: " + adImg + ", URL: " + adUrl);
    }

    // Getters and Setters
    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public boolean isAdCompatibility() {
        return adCompatibility;
    }

    public void setAdCompatibility(boolean adCompatibility) {
        this.adCompatibility = adCompatibility;
    }
    
}
package BannerAd;

public class Adapter extends BannerAd {
    private Adaptee adaptee;

    public Adapter(String adName, String adImg, String adUrl, boolean adCompatibility, Adaptee adaptee) {
        super(adName, adImg, adUrl, adCompatibility);
        this.adaptee = adaptee;
    }

    @Override
    public void showAd() {
        adaptee.anotherShowAd();
    }
}
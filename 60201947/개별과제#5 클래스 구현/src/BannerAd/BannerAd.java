package BannerAd;

public class BannerAd {
    private String adNamd;
    private String adImg;
    private String adUrl;
    private boolean adCompatibility;

    public BannerAd(BannerBuilder builder) {
        return;
    }

    public String getAdNamd() {
        return adNamd;
    }

    public String getAdImg() {
        return adImg;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public boolean getAdCompatibility() {
        return adCompatibility;
    }

    public static class BannerBuilder {
        private String adNamd;
        private String adImg;
        private String adUrl;
        private boolean adCompatibility;

        public BannerBuilder setAdNamd(String adNamd) {
            this.adNamd = adNamd;
            return this;
        }

        public BannerBuilder setAdImg(String adImg) {
            this.adImg = adImg;
            return this;
        }

        public BannerBuilder setAdUrl(String adUrl) {
            this.adUrl = adUrl;
            return this;
        }

        public BannerBuilder setAdCompatibility(boolean adCompatibility) {
            this.adCompatibility = adCompatibility;
            return this;
        }

        public BannerAd build() {
            return new BannerAd(this);
        }

    }

    public void viewAd() {
        return;
    }

}

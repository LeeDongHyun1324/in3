package Policy;

public class Proxy implements Policy {
    private RealPolicy realPolicy;
    private String dummyMessage;

    public Proxy(String dummyMessage) {
        this.dummyMessage = dummyMessage;
    }

    @Override
    public void getPolicyDetails() {
        if (realPolicy == null) {
            realPolicy = new RealPolicy("123", "Sample Policy", "http://example.com", "This is a sample policy.");
        }
        realPolicy.getPolicyDetails();
    }

    // dummyMessage에 대한 getter와 setter
    public String getDummyMessage() {
        return dummyMessage;
    }

    public void setDummyMessage(String dummyMessage) {
        this.dummyMessage = dummyMessage;
    }
}
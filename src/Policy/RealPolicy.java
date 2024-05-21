package Policy;

public class RealPolicy implements Policy {
    private String policyId;
    private String policyName;
    private String policyUrl;
    private String details;

    public RealPolicy(String policyId, String policyName, String policyUrl, String details) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyUrl = policyUrl;
        this.details = details;
    }

    @Override
    public void getPolicyDetails() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Policy Name: " + policyName);
        System.out.println("Policy URL: " + policyUrl);
        System.out.println("Details: " + details);
    }

    // 속성에 대한 getter와 setter
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
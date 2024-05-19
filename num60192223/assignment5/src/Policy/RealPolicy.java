package Policy;

public class RealPolicy {
    private String policyId; // 정책 ID
    private String name; // 정책 이름
    private String policyUrl; // 정책 URL
    private String details; // 정책 세부사항

    // policyId의 getter
    public String getPolicyId() {
        return policyId;
    }

    // policyId의 setter
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    // name의 getter
    public String getName() {
        return name;
    }

    // name의 setter
    public void setName(String name) {
        this.name = name;
    }

    // policyUrl의 getter
    public String getPolicyUrl() {
        return policyUrl;
    }

    // policyUrl의 setter
    public void setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
    }

    // details의 getter
    public String getDetails() {
        return details;
    }

    // details의 setter
    public void setDetails(String details) {
        this.details = details;
    }

    // 정책 세부사항을 가져오는 메서드
    public void getPolicyDetails() {
        
    }
}
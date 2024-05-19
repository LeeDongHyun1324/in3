package Policy;

public class PolicyModification {
    private String policyId; // 정책 ID
    private String managerId; // 관리자 ID

    // policyId의 getter
    public String getPolicyId() {
        return policyId;
    }

    // policyId의 setter
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    // managerId의 getter
    public String getManagerId() {
        return managerId;
    }

    // managerId의 setter
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    // 수정 메서드
    public void modification() {

    }

    // 수정 승인 메서드
    public void approveModification() {

    }
}
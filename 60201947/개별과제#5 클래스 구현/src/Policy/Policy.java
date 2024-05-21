package Policy;

public class Policy {
    private String policyId;
    private String policyName;
    private String policyUrl;
    private String policyStartDate;
    private String policyEndDate;
    private String policyDetails;
    private String policyTargets;

    public void viewPolicy() {
        System.out.println("Viewing policy: ");
        System.out.println("정책 id: " + policyId);
        System.out.println("정책명: " + policyName);
        System.out.println("사이트주소: " + policyUrl);
        System.out.println("신청 시작일: " + policyStartDate);
        System.out.println("신청 마감일: " + policyEndDate);
        System.out.println("세부내용: " + policyDetails);
        System.out.println("신청 대상: " + policyTargets);
        return;
    }

    public String getPolicyName() {
        return policyName;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public String getPolicyTargets() {
        return policyTargets;
    }

}

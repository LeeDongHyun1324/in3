package Policy;

public class Manager {
    private String managerId; // 관리자 ID
    private String managerPassword; // 관리자 비밀번호

    // managerId의 getter
    public String getManagerId() {
        return managerId;
    }

    // managerId의 setter
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    // managerPassword의 getter
    public String getManagerPassword() {
        return managerPassword;
    }

    // managerPassword의 setter
    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public void addNewPolicy() {}

    public void deletePost() {}
}
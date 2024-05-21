package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BannerAd.BannerAd;
import Policy.Policy;
import Policy.PolicyList;

public class User {
    private String userId;
    private String userPassword;
    private String email;
    private String userName;
    private ArrayList<String> bookmarkList; // 즐겨찾기 목록
    private ArrayList<String> notificationList; // 알림 리스트
    private boolean compatibility; // 계정 유효성
    private UserInformation userInfo; // 사용자 상세 정보
    private int reportCount; // 받은 신고 수
    private ArrayList<String> postList; // 사용자 작성 게시글 리스트
    private boolean loginState; // 로그인 여부

    public User(UserBuilder builder) {
        bookmarkList = new ArrayList<>();
        notificationList = new ArrayList<>();
        compatibility = true;
        reportCount = 0;
        postList = new ArrayList<>();
        loginState = false;
        userInfo = null;
        return;
    }

    // Getter
    public String getId() {
        return userId;
    }

    public String getPassword() {
        return userPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public int getReportCount() {
        return reportCount;
    }

    public ArrayList<String> getBookmarkList() {
        return bookmarkList;
    }

    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public boolean getCompatibility() {
        return compatibility;
    }

    public UserInformation getUserInfo() {
        return userInfo;
    }

    public ArrayList<String> getPostList() {
        return postList;
    }

    public boolean getLoginState() {
        return loginState;
    }

    // UserBuilder
    public static class UserBuilder {
        private String userId;
        private String userPassword;
        private String email;
        private String userName;

        // password 필수 입력값
        public UserBuilder(String userPassword) {
            this.userPassword = userPassword;
        }

        public UserBuilder setId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.userId = email;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // 즐겨찾기 및 알림 관련 메서드 # 북마크 추가
    public void addBookMark(String policyId) {
        this.bookmarkList
                .add(policyId);
    }

    // # 북마크 삭제
    public void deleteBookMark(String policyId) {
        this.bookmarkList
                .remove(policyId);
    }

    // # 알림 추가
    public void addNotification(String policyId) {
        this.notificationList
                .add(policyId);
    }

    // # 알림 삭제
    public void deleteNotification(String policyId) {
        this.notificationList
                .remove(policyId);
    }

    // 정책 관련 메서드 # 정책 조회 (정책명으로 조회)
    public List<Policy> searchPolicyByName(String policyName) {
        PolicyList policyList = PolicyList.getInstance();
        List<Policy> policies = policyList.getPolicies();
        List<Policy> filteredPolices = new ArrayList<>();
        for (Policy policy : policies) {
            if (policy.getPolicyName().equalsIgnoreCase(policyName)) {
                filteredPolices.add(policy);
            }
        }
        return filteredPolices;
    }

    // # 정책 조회 (전체 조회)
    public List<Policy> searchPolicyAll() {
        PolicyList policyList = PolicyList.getInstance();
        List<Policy> policies = policyList.getPolicies();
        return policies;
    }

    // # 정책 상세 조회
    public void viewPolicyDetaios(String policyId) {

        return;
    }

    // # 사용자 상세 정보 입력
    public void inputProfile() {
        Scanner scanner = new Scanner(System.in);

        System.out
                .print("나이: ");
        int age = scanner.nextInt();

        System.out
                .print("직업: ");
        String occupation = scanner.nextLine();

        System.out
                .print("성별: ");
        String gender = scanner.nextLine();

        System.out
                .print("가족 구성원:  ");
        String familyStatus = scanner.nextLine();

        System.out
                .print("주택 수:");
        String houses = scanner.nextLine();

        System.out
                .print("자산: ");
        int assets = scanner.nextInt();

        System.out
                .print("소득: ");
        int incomes = scanner.nextInt();

        this.userInfo = new UserInformation.UserInfoBuilder()
                .setAge(age)
                .setOccupation(occupation)
                .setGender(gender)
                .setFamilyStatus(familyStatus)
                .setHouses(houses)
                .setAssets(assets)
                .setIncomes(incomes)
                .build();

        scanner.close();
        return;
    }

    // # 배너광고 관련
    public void viewAd(BannerAd ad) {
        ad.viewAd();
        return;
    }

}

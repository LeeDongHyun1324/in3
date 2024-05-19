package Client;

import java.util.List;

public class User {
    private String userId;
    private String userPassword;
    private String email;
    private String userName;
    private List<String> bookmarkList; // 즐겨찾기 목록
    private List<String> notificationList; // 알림 리스트
    private boolean compatibility; // 계정 유효성
    private UserInformation userInfo; // 사용자 상세 정보
    private int reportCount; // 받은 신고 수
    private List<String> postList; // 사용자 작성 게시글 리스트
    private boolean loginState; // 로그인 여부

    public User(UserBuilder builder) {
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

    // 즐겨찾기 및 알림 관련 메서드
    // # 북마크 추가
    public void addBookMark(String policyId) {
        return;
    }

    // # 북마크 삭제
    public void deleteBookMark(String policyId) {
        return;
    }

    // # 알림 추가
    public void addNotification(String policyId) {
        return;
    }

    // # 알림 삭제
    public void deleteNotification(String policyId) {
        return;
    }

    // 정책 관련 메서드
    // # 정책 조회
    public void searchPolicyByName(String name) {
        return;
    }

    public void searchPolicyAll() {
        return;
    }

    // # 정책 상세 조회
    public void viewPolicyDetaios(String policyId) {
        return;
    }

    // # 사용자 상세 정보 입력
    public void inputProfile() {
        return;
    }

    // 자유게시판 관련
    // # 신고 게시글 조회
    public List<String> checkMyReportedPosts() {
        return null;
    }
    // #

    // 배너광고 관련
    public void viewAd(String adImag, String adUrl) {
        return;
    }

}

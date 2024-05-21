package Login;

public class Facade {
    private LoginHandler loginHandler;
    private PasswordResetHandler passwordResetHandler;
    private Finder finder;
    private Register register;
    private AccountDeletion accountDeletion;

    // 생성자
    public Facade() {
        this.loginHandler = new LoginHandler();
        this.passwordResetHandler = new PasswordResetHandler();
        this.finder = new Finder();
        this.register = new Register();
        this.accountDeletion = new AccountDeletion();
    }

    // 사용자 로그인
    public void loginUser(String userId, String userPassword) {
        loginHandler.login(userId, userPassword);
    }

    // 사용자 로그아웃
    public void logoutUser() {
        loginHandler.logout();
    }

    // 임시 비밀번호 생성
    public String createTemporaryPassword() {
        return passwordResetHandler.createTempPassword();
    }

    // 비밀번호 수정
    public void resetPassword(String userId, String newPassword) {
        passwordResetHandler.modifyPassword(userId, newPassword);
    }

    // 이메일로 사용자 ID 찾기
    public String findUserIdByEmail(String userEmail) {
        return finder.findId(userEmail);
    }

    // 사용자 등록
    public void registerUser(String userId, String userEmail) {
        if (register.validateInformation() && !register.checkDuplicate(userId)) {
            register.sendEmailVerification(userEmail);
        } else {
            System.out.println("사용자 정보를 등록할 수 없습니다.");
        }
    }

    // 계정 삭제
    public void deleteUserAccount(String userId, String userPassword) {
        accountDeletion.deleteAccount(userId, userPassword);
    }

    public static void main(String[] args) {
        Facade facade = new Facade();

        // 사용자 로그인
        facade.loginUser("exampleUserId", "examplePassword");

        // 사용자 로그아웃
        facade.logoutUser();

        // 임시 비밀번호 생성
        String tempPassword = facade.createTemporaryPassword();
        System.out.println("생성된 임시 비밀번호: " + tempPassword);

        // 비밀번호 수정
        facade.resetPassword("exampleUserId", "newPassword");

        // 이메일로 사용자 ID 찾기
        String userId = facade.findUserIdByEmail("user@example.com");
        System.out.println("찾은 사용자 ID: " + userId);

        // 사용자 등록
        facade.registerUser("newUserId", "newUser@example.com");

        // 계정 삭제
        facade.deleteUserAccount("exampleUserId", "examplePassword");
    }
}
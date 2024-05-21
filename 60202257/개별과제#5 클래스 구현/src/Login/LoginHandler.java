package Login;

public class LoginHandler {
    private boolean loginState;

    // 생성자
    public LoginHandler() {
        this.loginState = false;
    }

    // 로그인 메소드
    public void login(String userId, String userPassword) {
        // 여기에서 userId와 userPassword를 저장된 값과 비교하는 로직을 추가해야 합니다.
        // 예를 들어, if (checkCredentials(userId, userPassword)) { ... }
        // 데모를 위해 성공적인 로그인을 가정합니다:
        this.loginState = true;
        System.out.println("사용자가 성공적으로 로그인했습니다.");
    }

    // 로그아웃 메소드
    public void logout() {
        this.loginState = false;
        System.out.println("사용자가 성공적으로 로그아웃했습니다.");
    }

    // loginState의 Getter
    public boolean isLoginState() {
        return loginState;
    }

    // 자격 증명 확인을 위한 비공개 메소드 (이것은 실제 구현을 위한 자리 표시자일 뿐입니다)
    private boolean checkCredentials(String userId, String userPassword) {
        // 실제 자격 증명 확인 로직으로 대체해야 합니다.
        return true;
    }
}
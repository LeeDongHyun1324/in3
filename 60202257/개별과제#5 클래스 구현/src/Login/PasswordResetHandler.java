package Login;

import java.util.Random;

public class PasswordResetHandler {
    // 임시 비밀번호를 생성하는 메소드
    public String createTempPassword() {
        // 랜덤한 임시 비밀번호를 생성합니다.
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder tempPassword = new StringBuilder();
        Random rnd = new Random();
        while (tempPassword.length() < 8) { // 임시 비밀번호의 길이를 8자로 설정
            int index = (int) (rnd.nextFloat() * chars.length());
            tempPassword.append(chars.charAt(index));
        }
        String tempPwd = tempPassword.toString();
        System.out.println("임시 비밀번호가 생성되었습니다: " + tempPwd);
        return tempPwd;
    }

    // 비밀번호를 수정하는 메소드
    public void modifyPassword(String userId, String userPassword) {
        // 여기서는 userId와 연결된 비밀번호를 수정하는 로직을 구현합니다.
        // 예를 들어 데이터베이스에 접근하여 비밀번호를 업데이트할 수 있습니다:
        System.out.println("사용자 " + userId + "의 비밀번호가 수정되었습니다.");
        // 실제로는 데이터베이스에 비밀번호를 저장하는 로직이 필요합니다.
    }
}
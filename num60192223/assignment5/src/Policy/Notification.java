package Policy;

import Client.UserInformation;

public class Notification {
    private String notificationId;

    public String getNotificationId() {
        return notificationId;
    }

    // Notification 적합성 판단
    public boolean checkCompatibility(boolean compatibility) {
        return true;
    }

    // 사용자 정보 확인
    public void checkUserInfo(UserInformation userInfo) {
        return;
    }
}

package Policy;

import Client.UserInformation;

public class Notification {
    private String notificationId;

    public String getNotificationId() {
        return notificationId;
    }

    // Notification 적합성 판단
    public boolean checkCompatibility(boolean compatibility) {
        return compatibility;
    }

    // 사용자 정보 확인
    public void checkUserInfo(UserInformation userInfo) {
        int age = userInfo.getAge();
        String occupation = userInfo.getOccupation();
        String gender = userInfo.getGender();
        String familyStatus = userInfo.getFamilyStatus();
        String houses = userInfo.getHouses();
        int assets = userInfo.getAssets();
        int incomes = userInfo.getIncomes();

        System.out.println("사용자 정보 확인: ");
        System.out.println("나이: " + age);
        System.out.println("직업: " + occupation);
        System.out.println("성별: " + gender);
        System.out.println("가족 관계: " + familyStatus);
        System.out.println("주택: " + houses);
        System.out.println("자산: " + assets);
        System.out.println("소득: " + incomes);

        return;
    }
}

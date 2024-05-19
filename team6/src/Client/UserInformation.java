package Client;

public class UserInformation {
    private int age;
    private String occupation;
    private String gender;
    private String familyStatus;
    private String houses;
    private int assets;
    private int incomes;

    public UserInformation(UserInfoBuilder builder) {
        return;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getGender() {
        return gender;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public String getHouses() {
        return houses;
    }

    public int getAssets() {
        return assets;
    }

    public int getIncomes() {
        return incomes;
    }

    // UserInfo Builder
    public static class UserInfoBuilder {
        private int age;
        private String occupation;
        private String gender;
        private String familyStatus;
        private String houses;
        private int assets;
        private int incomes;

        public UserInfoBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserInfoBuilder setOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public UserInfoBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserInfoBuilder setFamilyStatus(String familyStatus) {
            this.familyStatus = familyStatus;
            return this;
        }

        public UserInfoBuilder setHouses(String houses) {
            this.houses = houses;
            return this;
        }

        public UserInfoBuilder setAssets(int assets) {
            this.assets = assets;
            return this;
        }

        public UserInfoBuilder setIncomes(int incomes) {
            this.incomes = incomes;
            return this;
        }

        public UserInformation build() {
            return new UserInformation(this);
        }
    }
}

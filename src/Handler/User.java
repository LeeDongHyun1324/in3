package Handler;


public class User {
    private String name;
    private String email;
    private int reportCount;
    private int warningCount;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.reportCount = 0;
    }

    public void warn() {
        
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void incrementReportCount() {
        reportCount++;
    }
    //사용자 정지 메서드
    public void suspend() {
        
    }
}

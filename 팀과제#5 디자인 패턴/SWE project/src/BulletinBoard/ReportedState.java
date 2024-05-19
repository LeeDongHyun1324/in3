package BulletinBoard;

public class ReportedState implements State {
    @Override
    public void handle(Post post) {
        
    }
    // 게시물 신고 알림
    public void sendReportNotification(Post post) {
        
    }
    // ReportedState일 때만 ReportPostCommand 클래스 사용 가능하게 하는 메서드
    @Override
    public void executeCommand(Command command) {
        
    }
    // 이전 상태로 복구
    @Override
    public void undo(Post post) {
        
    }
}

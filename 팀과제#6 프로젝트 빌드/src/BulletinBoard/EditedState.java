package BulletinBoard;
import java.util.Date;

public class EditedState implements State {
    @Override
    public void handle(Post post) {
       
    }

    // 게시물 수정 알림
    public void sendEditNotification(Post post) {
        
    }

    // 수정 내역 저장
    public void saveEditHistory(Post post) {
        
    }
    // 태그 갱신
    public void updateTags(Post post, String[] newTags) {
        
    }

    // EditedState일 때만 EditPostCommand 클래스 사용 가능하게 하는 메서드
    @Override
    public void executeCommand(Command command) {
       
    }
    // 이전 상태로 복구
    @Override
    public void undo(Post post) {
        
    }
}

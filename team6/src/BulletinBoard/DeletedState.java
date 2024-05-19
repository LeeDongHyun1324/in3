package BulletinBoard;
import java.util.Date;

public class DeletedState implements State {
    @Override
    public void handle(Post post) {
        
    }

    //게시글 삭제 알림
    public void sendDeletionNotification(Post post) {
        
    }

    // 삭제 이유 설정
    public void setDeletionReason(Post post, String reason) {
        
    }

    // DeletedState일 때만 DeletePostCommand 클래스를 사용 가능하게 하는 메서드
    @Override
    public void executeCommand(Command command) {
        
    }
    //Undo를 활용한 게시글 복구
    @Override
    public void undo(Post post) {
       
    }
}

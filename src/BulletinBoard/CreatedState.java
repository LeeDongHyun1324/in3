package BulletinBoard;

import java.util.Date;

import Handler.User;

public class CreatedState implements State {
    @Override
    public void handle(Post post) {
        
    }
    //게시물 작성 알림
    public void sendCreationNotification(Post post) {
        
    }
    //작성자 정보
    public void setAuthorInfo(Post post, User author) {
        
    }
    //태그
    public void setInitialTags(Post post, String[] tags) {
       
    }
    // CreatedState일 때만 CreatePostCommand 클래스를 사용 가능하게 하는 메서드
    public void executeCommand(Command command) {
       
    } 
    //Undo를 활용한 게시글 삭제
    @Override
    public void undo(Post post) {
       
    }
}


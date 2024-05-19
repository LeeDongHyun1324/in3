package BulletinBoard;

public class DeletePostCommand implements Command {
    private BulletinBoard bulletinBoard;
    private Post post;

    public DeletePostCommand(BulletinBoard bulletinBoard, Post post) {
        this.bulletinBoard = bulletinBoard;
        this.post = post;
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {
        
    }
}

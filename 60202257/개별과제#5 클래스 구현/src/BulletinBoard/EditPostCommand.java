package BulletinBoard;

public class EditPostCommand implements Command {
    private BulletinBoard bulletinBoard;
    private Post oldPost;
    private Post newPost;

    public EditPostCommand(BulletinBoard bulletinBoard, Post oldPost, Post newPost) {
        this.bulletinBoard = bulletinBoard;
        this.oldPost = oldPost;
        this.newPost = newPost;
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {
        
    }
}

package BulletinBoard;

public class ReportPostCommand implements Command {
    private Post post;

    public ReportPostCommand(Post post) {
        this.post = post;
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {
        
    }
}
package BulletinBoard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePostCommandTest {
    private BulletinBoard bulletinBoard;
    private Post post;
    private CreatePostCommand command;

    @BeforeEach
    public void setUp() {
        bulletinBoard = new BulletinBoard();
        post = new Post("Content");
        command = new CreatePostCommand(bulletinBoard, post);
    }

    @Test
    public void testExecute() {
        command.execute();

        assertEquals(1, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndo() {
        command.execute();

        command.undo();

        assertEquals(0, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndoAfterExecute() {
        command.execute();
        command.undo();
        
        assertEquals(0, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndoWithoutExecute() {
        assertThrows(Exception.class, () -> command.undo());
    }

    @Test
    public void testUndoMultipleTimes() {
        command.execute();
        command.undo();
        command.execute();
        command.undo();

        assertEquals(0, bulletinBoard.getPosts().size());
    }
}
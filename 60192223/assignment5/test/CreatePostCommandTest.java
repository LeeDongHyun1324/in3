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
        // Act
        command.execute();

        // Assert
        assertEquals(1, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndo() {
        // Arrange
        command.execute();

        // Act
        command.undo();

        // Assert
        assertEquals(0, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndoAfterExecute() {
        // Act
        command.execute();
        command.undo();

        // Assert
        assertEquals(0, bulletinBoard.getPosts().size());
    }

    @Test
    public void testUndoWithoutExecute() {
        // Act & Assert
        assertThrows(Exception.class, () -> command.undo());
    }

    @Test
    public void testUndoMultipleTimes() {
        // Arrange
        command.execute();
        command.undo();
        command.execute();
        command.undo();

        // Assert
        assertEquals(0, bulletinBoard.getPosts().size());
    }
}
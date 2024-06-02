package BulletinBoard;

import static org.junit.jupiter.api.Assertions.*;

import Handler.User;
import org.junit.jupiter.api.*;
import java.util.Date;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CreatedStateTest {
    private Post post;
    private CreatedState state;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        post = new Post("Content");
        state = new CreatedState();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testHandle() {
        // Act
        state.handle(post);

        // Assert
        assertTrue(post.isVisible());
        assertNotNull(post.getCreatedTime());
    }

    @Test
    public void testSendCreationNotification() {
        // Arrange
        String content = "New Content";

        // Act
        post.setContent(content);
        state.sendCreationNotification(post);

        // Assert
        assertEquals("새로운 게시물이 작성되었습니다 : New Content", systemOut());
    }

    @Test
    public void testSetAuthorInfo() {
        // Arrange
        User author = new User("John");

        // Act
        state.setAuthorInfo(post, author);

        // Assert
        assertEquals(author, post.getAuthor());
    }

    @Test
    public void testSetInitialTags() {
        // Arrange
        String[] tags = {"tag1", "tag2"};

        // Act
        state.setInitialTags(post, tags);

        // Assert
        assertArrayEquals(tags, post.getTags());
    }

    @Test
    public void testExecuteCommand() {
        // Arrange
        Command command = new CreatePostCommand(new BulletinBoard(), post);

        // Act & Assert
        assertDoesNotThrow(() -> state.executeCommand(command));
    }

    // 지정된 메시지를 System.out으로 반환하는 보조 메서드
    private String systemOut() {
        return outContent.toString().trim();
    }
}


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
        state.handle(post);

        assertTrue(post.isVisible());
        assertNotNull(post.getCreatedTime());
    }

    @Test
    public void testSendCreationNotification() {
        String content = "New Content";

        post.setContent(content);
        state.sendCreationNotification(post);

        assertEquals("새로운 게시물이 작성되었습니다 : New Content", systemOut());
    }

    @Test
    public void testSetAuthorInfo() {
        User author = new User("John");

        state.setAuthorInfo(post, author);

        assertEquals(author, post.getAuthor());
    }

    @Test
    public void testSetInitialTags() {
        String[] tags = {"tag1", "tag2"};

        state.setInitialTags(post, tags);

        assertArrayEquals(tags, post.getTags());
    }

    @Test
    public void testExecuteCommand() {
        Command command = new CreatePostCommand(new BulletinBoard(), post);

        assertDoesNotThrow(() -> state.executeCommand(command));
    }

    // 지정된 메시지를 System.out으로 반환하는 보조 메서드
    private String systemOut() {
        return outContent.toString().trim();
    }
}


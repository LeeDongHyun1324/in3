package BulletinBoard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BulletinBoardTest {
    private BulletinBoard board;

    @BeforeEach
    public void setUp() {
        board = new BulletinBoard();
    }

    @Test
    public void testAddPost() {
        Post post = new Post("Content");
        board.addPost(post);
        assertEquals(1, board.getPosts().size());
    }

    @Test
    public void testUpdatePost() {
        Post oldPost = new Post("Old Content");
        Post newPost = new Post("New Content");
        board.addPost(oldPost);
        board.updatePost(oldPost, newPost);
        assertEquals(1, board.getPosts().size());
        assertEquals("New Content", board.getPosts().get(0).getContent());
    }

    @Test
    public void testRemovePost() {
        Post post = new Post("Content");
        board.addPost(post);
        board.removePost(post);
        assertEquals(0, board.getPosts().size());
    }

    @Test
    public void testGetPosts() {
        Post post1 = new Post("Content 1");
        Post post2 = new Post("Content 2");
        board.addPost(post1);
        board.addPost(post2);
        assertEquals(2, board.getPosts().size());
    }

    @Test
    public void testSearchByTag() {
        Post post1 = new Post("Content 1");
        Post post2 = new Post("Content 2");
        post1.setTags(new String[]{"tag1"});
        post2.setTags(new String[]{"tag2"});
        board.addPost(post1);
        board.addPost(post2);
        assertEquals(1, board.searchByTag("t1ag").size());
    }
}
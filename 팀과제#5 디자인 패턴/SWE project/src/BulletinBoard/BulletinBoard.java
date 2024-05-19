package BulletinBoard;
import java.util.*;

public class BulletinBoard {
    private List<Post> posts = new ArrayList<>();

    public void addPost(Post post) {
        
    }

    public void updatePost(Post oldPost, Post newPost) {
        
    }

    public void removePost(Post post) {
        
    }

    public List<Post> getPosts() {
        return posts;
    }
    //태그 탐색 메서드
    public List<Post> searchByTag(String tag) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            for (String postTag : post.getTags()) {
                if (postTag.equalsIgnoreCase(tag)) {
                    result.add(post);
                    break;
                }
            }
        }
        return result;
    }
}

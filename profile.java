import java.util.ArrayList;
import java.util.List;

public class Profile extends User {
    private List<Post> posts;

    public Profile(String username, String bio) {
        super(username, bio);
        this.posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> filterPostsByAuthor(String author) {
        List<Post> filteredPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAuthor().equals(author)) {
                filteredPosts.add(post);
            }
        }
        return filteredPosts;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + getUsername() + '\'' +
                ", bio='" + getBio() + '\'' +
                ", posts=" + posts +
                '}';
    }
}

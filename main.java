import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork("MySocialApp");

        Profile profile1 = new Profile("john_doe", "Hello, I'm John!");
        Profile profile2 = new Profile("jane_doe", "Hey, it's Jane.");

        socialNetwork.addProfile(profile1);
        socialNetwork.addProfile(profile2);

        Post post1 = new Post(1, "This is John's first post!", "john_doe");
        Post post2 = new Post(2, "Jane's first post.", "jane_doe");
        Post post3 = new Post(3, "Another post by John.", "john_doe");

        profile1.addPost(post1);
        profile1.addPost(post3);
        profile2.addPost(post2);

        System.out.println("All profiles:");
        System.out.println(socialNetwork);

        System.out.println("\nSearching for John's profile:");
        System.out.println(socialNetwork.searchProfile("john_doe"));

        System.out.println("\nPosts by John:");
        List<Post> johnPosts = profile1.filterPostsByAuthor("john_doe");
        johnPosts.forEach(System.out::println);

        System.out.println("\nSorted profiles by name:");
        socialNetwork.sortProfilesByName().forEach(System.out::println);
    }
}

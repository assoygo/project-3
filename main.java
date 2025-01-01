import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork("MySocialApp");

        Profile profile1 = new Profile("Asylkhan", "Hello, I'm Asylkhan!");
        Profile profile2 = new Profile("Era", "Hey, it's Era.");

        socialNetwork.addProfile(profile1);
        socialNetwork.addProfile(profile2);

        Post post1 = new Post(1, "This is Asylkhan's first post!", "Asylkhan");
        Post post2 = new Post(2, "Era's first post.", "Era");
        Post post3 = new Post(3, "Another post by Asylkhan.", "Asylkhan");

        profile1.addPost(post1);
        profile1.addPost(post3);
        profile2.addPost(post2);

        System.out.println("All profiles:");
        System.out.println(socialNetwork);

        System.out.println("\nSearching for Asylkhan's profile:");
        System.out.println(socialNetwork.searchProfile("Asylkhan"));

        System.out.println("\nPosts by Asylkhan:");
        List<Post> AsylkhanPosts = profile1.filterPostsByAuthor("Asylkhan");
        AsylkhanPosts.forEach(System.out::println);

        System.out.println("\nSorted profiles by name:");
        socialNetwork.sortProfilesByName().forEach(System.out::println);
    }
}

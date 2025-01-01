import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SocialNetwork {
    private String name;
    private List<Profile> profiles;

    public SocialNetwork(String name) {
        this.name = name;
        this.profiles = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public Profile searchProfile(String username) {
        return profiles.stream()
                .filter(profile -> profile.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public List<Profile> sortProfilesByName() {
        profiles.sort(Comparator.comparing(User::getUsername));
        return profiles;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "name='" + name + '\'' +
                ", profiles=" + profiles +
                '}';
    }
}

public abstract class User {
    private String username;
    private String bio;

    public User(String username, String bio) {
        this.username = username;
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}

package questions;

public class Post {

    public int userId;
    public int id;
    public String title;
    public String body;

    @Override
    public String toString() {
        return "Post [userId=" + userId + ", id=" + id +
                ", title='" + title + ", body='" + body + ']';
    }
}

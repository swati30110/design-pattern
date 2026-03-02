package composite.example2;

public interface CommentComponent {
    void display(String indent);
    void add(CommentComponent comment);
}

package composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Comment implements CommentComponent{
    private String author;
    private String message;
    private List<CommentComponent> replies = new ArrayList<>();
    public Comment(String author, String message){
        this.author = author;
        this.message = message;
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + author + ": "+message);
        for (CommentComponent reply : replies){
            reply.display(indent+ " ");
        }
    }

    @Override
    public void add(CommentComponent comment) {
        replies.add(comment);
    }
}

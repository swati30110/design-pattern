package composite.example2;

public class Main {
    public static void main(String[] args) {
        Comment comment1 = new Comment("Swati", "This system design is amazing!");
        Comment reply1 = new Comment("Rahul", "Totally agree!");
        Comment reply2 = new Comment("Anita", "Can you explain more?");
        Comment reply21 = new Comment("Swati", "Sure, I'll share more details.");
        reply2.add(reply21);

        comment1.add(reply1);
        comment1.add(reply2);

        Comment comment2 = new Comment("Amit", "Very helpful post!");

        comment1.display("");
        comment2.display("");
    }
}

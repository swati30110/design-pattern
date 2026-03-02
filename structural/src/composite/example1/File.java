package composite.example1;

public class File implements FileSystemComponent {
    String name;
    File(String name){
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("File: "+name);
    }
}

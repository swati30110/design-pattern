package composite.example1;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("loan.pdf");
        File file2 = new File("Adhaar.pdf");

        Folder mainFolder = new Folder("Documents");
        mainFolder.add(file1);
        mainFolder.add(file2);

        Folder subFolder = new Folder("Projects");
        subFolder.add(new File("design.dox"));
        mainFolder.add(subFolder);
        mainFolder.showDetails();
    }
}

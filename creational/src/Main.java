import singleton.MySQLConnection;
import singleton.MySQLConnectionII;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MySQLConnection mq = MySQLConnection.getInstance();
        System.out.println(mq);
        mq = MySQLConnection.getInstance();
        System.out.println(mq);
        MySQLConnectionII mqII = MySQLConnectionII.getInstance();
        System.out.println(mqII);
    }
}
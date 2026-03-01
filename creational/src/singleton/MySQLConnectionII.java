package singleton;

/**
 * Thread safe, no syncronization overhead
 */
public class MySQLConnectionII {
    private MySQLConnectionII(){}
    private static class Holder{
        private static final MySQLConnectionII INSTANCE = new MySQLConnectionII();
    }
    public static MySQLConnectionII getInstance(){
        return Holder.INSTANCE;
    }
}

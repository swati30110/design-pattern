package singleton;

/**
 * use case of signleton
 * DB connection
 * Logger
 * Threadpool
 * Cache
 */
public class MySQLConnection {
    private String username;
    private String password;
    private String host;
    private int port;
    private String databaseName;
    private static volatile MySQLConnection instance;
    private MySQLConnection(){
        // initialize connection
        this.username = "payment_username";
        this.password = "834732-572iehh";
        this.host = "host.com";
        this.port = 53057;
        this.databaseName = "payment_db_username";

    }
    public static MySQLConnection getInstance(){
        if(instance == null){
            instance = new MySQLConnection();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getDatabaseName() {
        return databaseName;
    }
}

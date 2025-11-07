/*
 * Implement a singleton class DatabaseConnection using a private constructor. Ensure that
 * the class restricts object creation to only one instance and provides a global access point using a
 * static method.
 */

class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionUrl;

    private DatabaseConnection() {
        this.connectionUrl = "mysql://localhost:3000/mydb";
        System.out.println("Database connection established: " + connectionUrl);
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

public class pract4 {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("db1 URL: " + db1.getConnectionUrl());
        System.out.println("db2 URL: " + db2.getConnectionUrl());

        System.out.println("Are both instances same? " + (db1 == db2));

        db1.executeQuery("SELECT * FROM users");
    }
}

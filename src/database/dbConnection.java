package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConnection {

    private final String HOST = "localjost";
    private final String PORT = "3306";
    private final String VERİTABANIADI = "koubank";
    private final String USER = "root";
    private final String PASSWORD = "";

    protected Connection connection = null;
    protected Statement statement = null;
    
    public dbConnection(){
    
        String url="jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.VERİTABANIADI;
        
        try {
            this.connection = DriverManager.getConnection(url,this.USER,this.PASSWORD);
            System.out.println("okey");
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no");
        }
    }

}

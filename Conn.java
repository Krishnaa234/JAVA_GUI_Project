package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c; //connection class object
    Statement s;
    public Conn() {
        //constructor
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "SQL_project12");
            s = c.createStatement();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}

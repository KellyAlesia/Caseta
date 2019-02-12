
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexiónBD {    
    Connection cn;
    
    public Connection conexion (){
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/caseta_electronica", "root", "");
        System.out.print("Se hizo la conexion exitosamente");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}

package com.example.backendclase22entrenador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDH2 {
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase22", "sa", "");
    }

    public static void cargarBD(){
        Connection connection=null;
        try{
            Class.forName("org.h2.Driver");
            connection=DriverManager.getConnection("jdbc:h2:~/clase22;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException ee){
                ee.printStackTrace();
            }
        }
    }
}

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "admin";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoa";

    public Connection obtemConexao () {
        try{
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://" + host + ":" + porta + "/" + bd,
        usuario,
        senha
        );
        return c;    
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

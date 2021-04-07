
package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    
    /*private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    url = "jdbc:postgresql://localhost:5432/tarefa";
    usuario = "postgres";
    senha = "postgres";
    */
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tarefa", "postgres", "postgres");
        return conexao;
    }
    
    /*conexao(){
        url = "jdbc:postgresql://localhost:5432/tarefa";
        usuario = "postgres";
        senha = "postgres";
        
    
    
        try {
            
            Statement s;
            
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            
            /*s = con.createStatement();
            
            s.executeQuery("insert into loja (nome) values ('jo');");
            
            
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
}

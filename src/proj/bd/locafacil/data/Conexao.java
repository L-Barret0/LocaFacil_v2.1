package proj.bd.locafacil.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    
    //Método de conexão com o banco de dados
    public Conexao(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "8603";
        System.out.println("conexão não realizada!");
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("conexão realizada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //Método genérico de execução. Ele recebe a string com comando específico e executa o comando
    public void execute(String sql){
        try {
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Método genérico de busca. Recebe um string de busca, executa e retorna a busca
    public ResultSet executaBusca(String sql){
        try {
            java.sql.Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

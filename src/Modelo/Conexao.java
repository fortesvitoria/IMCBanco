package Modelo;

import java.sql.Connection; //interface
import java.sql.DriverManager;
import java.sql.SQLException; //excessao

public class Conexao {
    //atributos
    private static final String url="jdbc:mysql://localhost:3306/imc?useTimezone=true&serverTimezone=UTC";
    private static final String usuario="root";
    private static final String senha="Vi07MySQL@";
    
    //metodo para conectar o banco de dados
    public static Connection conecta()throws SQLException{
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } 
        
        catch (SQLException erro) {
            throw new SQLException("Erro na conexao.\nCausa: "+ erro.getMessage());
        }
    }
    
}

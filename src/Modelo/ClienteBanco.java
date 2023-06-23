package Modelo;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement; //interface que reconhece o banco
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ClienteBanco {

    //metoto inserir 
    public static void cadastrarCliente(DadosCliente cliente) throws SQLException {

        try {
            //passar os dados do banco de dados
            Connection conexao = Conexao.conecta();

            //criar uma condição dp Java para interagir com o sql
            Statement query = conexao.createStatement();
            
            //data-------------------------------------------------
            // Obtém a data e hora atual
            LocalDateTime dataHoraAtual = LocalDateTime.now();
            // Define o formato de saída desejado
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Formata a data e hora atual usando o formato definido
            String dataHoraFormatada = dataHoraAtual.format(formato);
            
            //criar a query de sql(insert)
            String sql = "insert into clientes values(null,'" + cliente.getNome() + "'," + cliente.getPeso() + "," + cliente.getImc() + ",'" + dataHoraFormatada + "'," + cliente.getAltura() + ");";
            query.execute(sql);
            query.close();
            conexao.close();

        } catch (SQLException erro) {
            throw new SQLException("Erro ao inserir dados no banco de dados.\nCausa: " + erro.getMessage());
        }
    }

    //metoto listar
    public static ArrayList<DadosCliente> listarTodosClientes() throws SQLException {
        try {
            //passar os dados do banco de dados
            Connection conexao = Conexao.conecta();

            //criar uma condição dp Java para interagir com o sql
            Statement query = conexao.createStatement();

            String sql = "select * from clientes;";

            //pegar resultado da query
            ResultSet rs = query.executeQuery(sql);

            //criar um vetor dinamico para colocar o resultado da query
            ArrayList<DadosCliente> listaAux = new ArrayList<>();

            //percorrer os registros(linhas da tabela) no bando de dados
            while (rs.next()) {
                DadosCliente cliente = new DadosCliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setPeso(rs.getDouble("peso"));
                cliente.setImc(rs.getDouble("imc"));
                cliente.setDataAtual(rs.getDate("data_atual"));
                cliente.setAltura(rs.getDouble("altura"));

                //colocar a cada volta um elemento no arraylist
                listaAux.add(cliente);

            }
            return listaAux;

        } catch (SQLException erro) {
            throw new SQLException("Erro ao listar clientes no banco de dados.\nCausa: " + erro.getMessage());
        }
    }
    
        //metoto apagar
    public static void apagarCliente(DadosCliente cliente) throws SQLException {
        
        try {
            Connection conexao = Conexao.conecta();
            Statement query = conexao.createStatement();
            String sql = "delete from clientes where id_cliente = " + cliente.getIdCliente();
            query.execute(sql);
            query.close();
            conexao.close();
            
        } catch(SQLException erro) {
            throw new SQLException("Erro ao apagar cliente no banco de dados.\nCausa: " + erro.getMessage());
        }
        
    }
    
    
    //metoto atualizar

}

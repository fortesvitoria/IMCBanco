
package Controle;

import java.sql.SQLException;
import Modelo.ClienteBanco;
import Modelo.DadosCliente;
import java.util.ArrayList;


public class ControleContato {
    
        //inserir
    public void inserirCliente(DadosCliente cliente) throws SQLException {
        ClienteBanco.cadastrarCliente(cliente);
    }

    //listar
    public ArrayList<DadosCliente> lista() throws SQLException {

        return ClienteBanco.listarTodosClientes();
    }

    //apagar
    public void apagarCliente(DadosCliente cliente) throws SQLException {
        ClienteBanco.apagarCliente(cliente);

    }

    //atualizar
    
}

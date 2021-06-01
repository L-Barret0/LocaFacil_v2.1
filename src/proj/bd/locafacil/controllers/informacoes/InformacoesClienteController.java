package proj.bd.locafacil.controllers.informacoes;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Cliente;

public class InformacoesClienteController implements Initializable {

    @FXML
    protected void botVoltarMenuClientes(ActionEvent e) {
        System.out.println("Voltou ao menu Clientes");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @FXML
    protected void botExcluirClientes(ActionEvent e) {
        System.out.println("Excluiu Cliente");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @FXML
    protected void botEditarClientes(ActionEvent e) {
        System.out.println("Entrou em editar cliente");
        LocaFacil_2_Apresentacao.changeConteudo("edicaoCliente");
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocaFacil_2_Apresentacao.addPassagemConteudoLista(new LocaFacil_2_Apresentacao.ModificadorConteudo() {
            @Override
            public void instrumentoModificadorConteudo(String novaCena, Object parametro) {
                if(novaCena.equals("InformacoesCliente")){
                    System.out.println("Tela: " + novaCena + 
                            "\tParametro: " + parametro);                    
                }
            }
        });
    }    
    
}

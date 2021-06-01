package proj.bd.locafacil.controllers.edicoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class EdicaoClienteController implements Initializable {
    
    @FXML
    protected void botCancelarEdicaoCliente(ActionEvent e) {
        System.out.println("Voltou ao menu Cliente");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @FXML
    protected void botSalvarEdicaoCliente(ActionEvent e) {
        System.out.println("Excluiu Cliente");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

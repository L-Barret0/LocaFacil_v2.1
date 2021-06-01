package proj.bd.locafacil.controllers.edicoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class EdicaoVeiculoController implements Initializable {

    @FXML
    protected void botCancelarEdicaoVeiculo(ActionEvent e) {
        System.out.println("Voltou ao menu Veiculo");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    
    @FXML
    protected void botSalvarEdicaoVeiculo(ActionEvent e) {
        System.out.println("Excluiu Veiculo");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

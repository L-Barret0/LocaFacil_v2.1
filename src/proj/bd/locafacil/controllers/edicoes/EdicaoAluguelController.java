package proj.bd.locafacil.controllers.edicoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class EdicaoAluguelController implements Initializable {
    
    @FXML
    protected void botCancelarEdicaoAluguel(ActionEvent e) {
        System.out.println("Voltou ao menu Aluguel");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    @FXML
    protected void botSalvarEdicaoAluguel(ActionEvent e) {
        System.out.println("Excluiu Aluguel");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }       
}

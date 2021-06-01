package proj.bd.locafacil.controllers.edicoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class EdicaoAdmController implements Initializable {

    @FXML
    protected void botCancelarEdicaoAdm(ActionEvent e) {
        System.out.println("Voltou ao menu Adm");
        LocaFacil_2_Apresentacao.changeConteudo("configuracoes");
    }
    
    @FXML
    protected void botSalvarEdicaoAdm(ActionEvent e) {
        System.out.println("Excluiu Adm");
        LocaFacil_2_Apresentacao.changeConteudo("configuracoes");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

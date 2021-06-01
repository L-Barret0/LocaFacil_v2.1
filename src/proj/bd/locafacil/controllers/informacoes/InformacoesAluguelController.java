package proj.bd.locafacil.controllers.informacoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class InformacoesAluguelController implements Initializable {

    @FXML
    protected void botVoltarMenuALuguel(ActionEvent e) {
        System.out.println("Voltou ao menu Aluguel");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    @FXML
    protected void botExcluirAluguel(ActionEvent e) {
        System.out.println("Excluiu Aluguel");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    @FXML
    protected void botEditarAluguel(ActionEvent e) {
        System.out.println("CadastrarAluguel");
        LocaFacil_2_Apresentacao.changeConteudo("edicaoAluguel");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

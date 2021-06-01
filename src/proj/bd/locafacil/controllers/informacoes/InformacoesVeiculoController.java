package proj.bd.locafacil.controllers.informacoes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class InformacoesVeiculoController implements Initializable {

    @FXML
    protected void botVoltarMenuVeiculo(ActionEvent e) {
        System.out.println("Voltou ao menu Veiculos");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    
    @FXML
    protected void botExcluirVeiculo(ActionEvent e) {
        System.out.println("Excluiu Veiculo");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    
    @FXML
    protected void botEditarVeiculo(ActionEvent e) {
        System.out.println("Entrou em editar Veiculo");
        LocaFacil_2_Apresentacao.changeConteudo("edicaoVeiculo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

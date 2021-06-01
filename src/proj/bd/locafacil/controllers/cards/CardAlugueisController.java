package proj.bd.locafacil.controllers.cards;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import proj.bd.locafacil.intermediarios.IntermediarioAluguel;
import proj.bd.locafacil.models.Aluguel;
import proj.bd.locafacil.models.Veiculos;

public class CardAlugueisController implements Initializable {

    @FXML
    private Label dataFimAluguel;
    
    @FXML
    private Label dataInicioAluguel;    
    
    @FXML
    private Label idAluguel;
    
    @FXML
    private Label nomeVeiculo;
    
    private Veiculos veiculo;
    private Aluguel aluguel;    
    private IntermediarioAluguel intermediarioAluguel;
    
    @FXML
    private void click(){
        intermediarioAluguel.onClickIntermediario(aluguel);        
    }
    
    public void setData(Aluguel aluguel, IntermediarioAluguel intermediarioAluguel){
        this.aluguel = aluguel;
        this.intermediarioAluguel = intermediarioAluguel;
        //nomeVeiculo.setText(veiculo.getModelo()); 
        dataFimAluguel.setText(aluguel.getDataFim());
        dataInicioAluguel.setText(aluguel.getDataFim());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }      
}

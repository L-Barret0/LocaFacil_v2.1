package proj.bd.locafacil.controllers.cards;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import proj.bd.locafacil.intermediarios.IntermediarioVeiculo;
import proj.bd.locafacil.models.Veiculos;

public class CardVeiculosController implements Initializable {
        
    @FXML
    private Label placaVeiculo;
    
    @FXML
    private Label dataAqusicaoVeiculo;    
    
    @FXML
    private Label idVeiculo;
    
    @FXML
    private Label modeloVeiculo;
        
    private Veiculos veiculo;    
    private IntermediarioVeiculo intermediarioVeiculo;
    
    @FXML
    private void click(){
        intermediarioVeiculo.onClickIntermediario(veiculo);        
    }
            
    public void setData(Veiculos veiculo, IntermediarioVeiculo intermediarioVeiculo){
        this.veiculo = veiculo;
        this.intermediarioVeiculo = intermediarioVeiculo;
        //nomeVeiculo.setText(veiculo.getModelo()); 
        modeloVeiculo.setText(veiculo.getModelo());
        dataAqusicaoVeiculo.setText(veiculo.getDataaqusicao());
        placaVeiculo.setText(veiculo.getPlaca());
        idVeiculo.setText("033");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
}

package proj.bd.locafacil.controllers.cards;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import proj.bd.locafacil.intermediarios.IntermediarioCliente;
import proj.bd.locafacil.models.Cliente;

public class CardClientesController implements Initializable {
    
    @FXML
    private Label cpfCliente;
    
    @FXML
    private Label dataNascimentoCliente;    
    
    @FXML
    private Label idCliente;
    
    @FXML
    private Label nomeCliente;
        
    private Cliente cliente;    
    private IntermediarioCliente intermediarioCliente;
    
    @FXML
    private void click(){
        intermediarioCliente.onClickIntermediario(cliente);        
    }
            
    public void setData(Cliente cliente, IntermediarioCliente intermediarioCliente){
        this.cliente = cliente;
        this.intermediarioCliente = intermediarioCliente;
        //nomeVeiculo.setText(veiculo.getModelo()); 
        nomeCliente.setText(cliente.getNome());
        cpfCliente.setText(cliente.getCpf());
        dataNascimentoCliente.setText(cliente.getDataNascimento());
        idCliente.setText("025");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

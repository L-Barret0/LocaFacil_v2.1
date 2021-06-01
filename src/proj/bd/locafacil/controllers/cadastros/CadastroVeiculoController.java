package proj.bd.locafacil.controllers.cadastros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Cliente;
import proj.bd.locafacil.models.Veiculos;

public class CadastroVeiculoController implements Initializable {

    @FXML
    protected void botCancelarCadastroVeiculo(ActionEvent e) {
        System.out.println("CadastrarVeiculo cancelado");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    
    @FXML
    private ToggleGroup valorVidroEletrico;
    @FXML
    private ToggleGroup valorArCondicionado;
    
    public void carregaValoresCheckBox(){        
        RadioButton rbVidroEletrico = (RadioButton) valorVidroEletrico.getSelectedToggle();
        RadioButton rbArCondicionado = (RadioButton) valorArCondicionado.getSelectedToggle();
        
        System.out.println("Vidros Eletricos: " + rbVidroEletrico.getText());
        System.out.println("Ar-Condicionado: " + rbArCondicionado.getText());
    }
    
    @FXML
    private TextField tfCadastroVeiculoDataAquisicao;

    @FXML
    private TextField tfCadastroVeiculoAnoFabricacao;

    @FXML
    private TextField tfCadastroVeiculoMarca;

    @FXML
    private TextField tfCadastroVeiculoCor;

    @FXML
    private TextField tfCadastroVeiculoPotencia;

    @FXML
    private TextField tfCadastroVeiculoValor;

    @FXML
    private TextField tfCadastroVeiculoModelo;

    @FXML
    private TextField tfCadastroVeiculoPlaca;

    @FXML
    private TextField tfCadastroVeiculoCambio;

    @FXML
    private TextField tfCadastroVeiculoDirecao;

    @FXML
    protected void botCadastroVeiculoCadastrar(ActionEvent event) {

        try {
            
            if(tfCadastroVeiculoPotencia.getText().isEmpty())
                throw new RuntimeException("É obrigatório informar a potencia!!");
            if(tfCadastroVeiculoCor.getText().isEmpty())
                throw new RuntimeException("É obrigatório informar a cor do veículo!!");
            if(tfCadastroVeiculoMarca.getText().isEmpty())
                throw new RuntimeException("O atributo E-mail é obrigatório!!");
            if(tfCadastroVeiculoAnoFabricacao.getText().isEmpty())
                throw new RuntimeException("O atributo Senha é obrigatório!!");
            if(tfCadastroVeiculoDataAquisicao.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            if(tfCadastroVeiculoDirecao.getText().isEmpty())
                throw new RuntimeException("O atributo nome é obrigatório!!");
            if(tfCadastroVeiculoCambio.getText().isEmpty())
                throw new RuntimeException("O atributo CPF é obrigatório!!");
            if(tfCadastroVeiculoPlaca.getText().isEmpty())
                throw new RuntimeException("O atributo E-mail é obrigatório!!");
            if(tfCadastroVeiculoModelo.getText().isEmpty())
                throw new RuntimeException("O atributo Senha é obrigatório!!");
            if(tfCadastroVeiculoValor.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            
            Veiculos Veiculos = new Veiculos(                    
                    tfCadastroVeiculoMarca.getText(),
                    tfCadastroVeiculoModelo.getText(),
                    tfCadastroVeiculoCor.getText(),
                    tfCadastroVeiculoPlaca.getText(),
                    tfCadastroVeiculoCambio.getText(),
                    tfCadastroVeiculoDirecao.getText(),
                    10.0,// potencia. tfCadastroVeiculoPotencia
                    true,// vidroseletricos
                    true, //arcondicionado
                    209,//tfCadastroVeiculoValor
                    11/11/1111, //tfCadastroVeiculoAnoFabricacao
                    tfCadastroVeiculoDataAquisicao.getText()      );
                
                //ins.insertVeiculo(ve, 3);
                LocaFacil_2_Apresentacao.changeConteudo("login");
            
        }catch (RuntimeException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao cadastrar Administrador");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
        /*
        carregaValoresCheckBox();         
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
        */
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }        
}

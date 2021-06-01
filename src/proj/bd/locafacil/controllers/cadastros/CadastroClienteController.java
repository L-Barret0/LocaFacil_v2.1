package proj.bd.locafacil.controllers.cadastros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import proj.bd.locafacil.data.Insert;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Cliente;

public class CadastroClienteController implements Initializable {

    @FXML
    private TextField tfCadastroClienteCidade;

    @FXML
    private TextField tfCadastroClienteNumero;

    @FXML
    private TextField tfCadastroClienteBairro;

    @FXML
    private TextField tfCadastroClienteNome;

    @FXML
    private TextField tfCadastroClienteEmail;

    @FXML
    private TextField tfCadastroClienteDataNascimento;

    @FXML
    private TextField tfCadastroClienteRua;

    @FXML
    private TextField tfCadastroClienteCep;

    @FXML
    private TextField tfCadastroClienteCpf;

    @FXML
    private TextField tfCadastroClienteCnh;

    @FXML
    private TextField tfCadastroClienteTelefone;
    
    
    Insert ins = new Insert();
    @FXML
    protected void botCadastroClienteCadastrar(ActionEvent e) {
        try {
            
            if(tfCadastroClienteNome.getText().isEmpty())
                throw new RuntimeException("O atributo nome é obrigatório!!");
            if(tfCadastroClienteBairro.getText().isEmpty())
                throw new RuntimeException("O atributo CPF é obrigatório!!");
            //if(textFildCadastroAdmEmail.getText().isEmpty())
               // throw new RuntimeException("O atributo E-mail é obrigatório!!");
           // if(passCadastroAdmSenha.getText().isEmpty())
             //   throw new RuntimeException("O atributo Senha é obrigatório!!");
            if(tfCadastroClienteRua.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            if(tfCadastroClienteCidade.getText().isEmpty())
                throw new RuntimeException("O atributo nome é obrigatório!!");
            if(tfCadastroClienteTelefone.getText().isEmpty())
                throw new RuntimeException("O atributo CPF é obrigatório!!");
            if(tfCadastroClienteDataNascimento.getText().isEmpty())
                throw new RuntimeException("O atributo E-mail é obrigatório!!");
            if(tfCadastroClienteCnh.getText().isEmpty())
                throw new RuntimeException("O atributo Senha é obrigatório!!");
            if(tfCadastroClienteEmail.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            if(tfCadastroClienteCpf.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            
            Cliente cl = new Cliente(                    
                    tfCadastroClienteNome.getText(),
                    tfCadastroClienteCpf.getText(),
                    tfCadastroClienteEmail.getText(),
                    tfCadastroClienteCnh.getText(),
                    tfCadastroClienteDataNascimento.getText(),
                    tfCadastroClienteTelefone.getText(),
                    tfCadastroClienteCidade.getText(),
                    tfCadastroClienteRua.getText(),
                    12,//tfCadastroClienteNumero
                    22,//tfCadastroClienteCep
                    tfCadastroClienteBairro.getText());
                
                //ins.insertCliente(cl, 3);
                LocaFacil_2_Apresentacao.changeConteudo("login");
            
        }catch (RuntimeException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao cadastrar Administrador");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
        
        
        
        System.out.println("CadastrarCliente cancelado");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @FXML
    protected void botCancelarCadastroCliente(ActionEvent e) {
        System.out.println("CadastrarCliente cancelado");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

package proj.bd.locafacil.controllers.cadastros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Administrador;

public class CadastroAdmController implements Initializable {
    
    //----------Capturar Dados
    @FXML
    private TextField textFildCadastroAdmNomeCompleto;
    @FXML
    private TextField textFildCadastroAdmCpf;
    @FXML
    private TextField textFildCadastroAdmEmail;
    @FXML
    private PasswordField passCadastroAdmConfirmarSenha;
    @FXML
    private PasswordField passCadastroAdmSenha;
    @FXML
    protected void botAdmCadastrar(ActionEvent event) {
        try {
            
            if(textFildCadastroAdmNomeCompleto.getText().isEmpty())
                throw new RuntimeException("O atributo nome é obrigatório!!");
            if(textFildCadastroAdmCpf.getText().isEmpty())
                throw new RuntimeException("O atributo CPF é obrigatório!!");
            if(textFildCadastroAdmEmail.getText().isEmpty())
                throw new RuntimeException("O atributo E-mail é obrigatório!!");
            if(passCadastroAdmSenha.getText().isEmpty())
                throw new RuntimeException("O atributo Senha é obrigatório!!");
            if(passCadastroAdmConfirmarSenha.getText().isEmpty())
                throw new RuntimeException("É obrigatório a confirmação da senha!!");
            
            //-----Ta dando erro nas senhas
            if(passCadastroAdmConfirmarSenha != passCadastroAdmSenha)
                throw new RuntimeException("As senhas estão diferentes!!");
            
            Administrador administrador = new Administrador(                    
                    textFildCadastroAdmNomeCompleto.getText(),
                    textFildCadastroAdmCpf.getText(),
                    textFildCadastroAdmEmail.getText(),
                    passCadastroAdmConfirmarSenha.getText());
                                   
                //ins.insertAdm(adm);
                LocaFacil_2_Apresentacao.changeConteudo("login");
            
        }catch (RuntimeException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao cadastrar Administrador");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }        
    }
    
    @FXML
    protected void botCancelarCadastroAdm(ActionEvent e) {
        System.out.println("CadastroAdm Cancelado");
        LocaFacil_2_Apresentacao.changeConteudo("login");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
}

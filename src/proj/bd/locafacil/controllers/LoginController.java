package proj.bd.locafacil.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Administrador;

public class LoginController implements Initializable {
    
    @FXML
    private TextField tfLoginEmail;

    @FXML
    private PasswordField passLoginSenha;
    
    @FXML
    protected void botLoginEntrar(ActionEvent event) {
        Administrador adm;
        
       /* List<Administrador> administradores = adm.getList();
        
        for (int i = 0; i < administradores.size(); i++){
            if(tfLoginEmail.getText().equals(administradores.get(i).getEmail()) && passLoginSenha.getText().equals(administradores.get(i).getSenha())){
                //Principal p = new Principal();
                i = administradores.size();
                System.out.println("Fez Login");
                LocaFacil_2_Apresentacao.changeConteudo("principal");
                
            }
            
            
            
        }
        */
        
        System.out.println("Fez Login");
        LocaFacil_2_Apresentacao.changeConteudo("principal");
    }
    
    @FXML
    protected void botLoginCadastrar(ActionEvent e) {
        System.out.println("CadastrarAdm");
        LocaFacil_2_Apresentacao.changeConteudo("cadastroAdm");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

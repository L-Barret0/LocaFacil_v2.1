package proj.bd.locafacil.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;

public class ConfiguracoesController implements Initializable {

    @FXML
    protected void botPrincipal(ActionEvent event) {
        System.out.println("Foi para Principal");
        LocaFacil_2_Apresentacao.changeConteudo("principal");
    }
    
    @FXML
    protected void botSair(ActionEvent event) {
        System.out.println("Saiu");
        LocaFacil_2_Apresentacao.changeConteudo("login");
    }
    
    @FXML
    protected void botConfuguracoes(ActionEvent event) {
        System.out.println("Foi para confuguracoes");
        LocaFacil_2_Apresentacao.changeConteudo("confuguracoes");
    }
    
    @FXML
    protected void botClientes(ActionEvent event) {
        System.out.println("Foi para clientes");
        LocaFacil_2_Apresentacao.changeConteudo("clientes");
    }
    
    @FXML
    protected void botVeiculos(ActionEvent event) {
        System.out.println("Foi para veiculos");
        LocaFacil_2_Apresentacao.changeConteudo("veiculos");
    }
    
    @FXML
    protected void botAlugueis(ActionEvent event) {
        System.out.println("Foi para Alugueis");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    @FXML
    protected void botEditarAdm(ActionEvent event) {
        System.out.println("Entrou em EditarAdm");
        LocaFacil_2_Apresentacao.changeConteudo("edicaoAdm");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

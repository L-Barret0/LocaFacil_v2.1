package proj.bd.locafacil.controllers;

import proj.bd.locafacil.controllers.cards.CardClientesController;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import proj.bd.locafacil.intermediarios.IntermediarioCliente;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Cliente;

public class ClientesController implements Initializable {

    @FXML
    protected void botCadastroCliente(ActionEvent e) {
        System.out.println("CadastrarCliente");
        LocaFacil_2_Apresentacao.changeConteudo("cadastroCliente");
    }
    
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
    private ScrollPane listaClientes;

    @FXML
    private GridPane gridClientes;
    
    private IntermediarioCliente intermediarioCliente;
    
    private List<Cliente> clientes = new ArrayList<>();
    
    
    private List<Cliente> getData() {
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente;
        
        cliente = new Cliente("String nome", "String cpf", "String email", "String cnh", "String dataNascimento", "String telefone", 
            "String endCidade", "String endRua", 11, 11, "String endBairro");
        cliente.setNome("Francisco"); 
        cliente.setCpf("000.000.000-00");
        cliente.setDataNascimento("20/12/4321");        
        clientes.add(cliente);
        
        return clientes;
    }
    
    private void setChosenCliente(Cliente cliente){        
        System.out.println("Mudando");
        LocaFacil_2_Apresentacao.changeConteudo("informacoesCliente");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientes.addAll(getData());
        
        if (clientes.size() > 0) {            
            intermediarioCliente = new IntermediarioCliente(){
                @Override
                public void onClickIntermediario(Cliente cliente) {
                    setChosenCliente(cliente);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < clientes.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/proj/bd/locafacil/views/cards/CardClientes.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                CardClientesController cardClientesController = fxmlLoader.getController();
                cardClientesController.setData(clientes.get(i), intermediarioCliente);

                if (column == 1) {
                    column = 0;
                    row++;
                }

                gridClientes.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                gridClientes.setMinWidth(Region.USE_COMPUTED_SIZE);
                gridClientes.setPrefWidth(Region.USE_COMPUTED_SIZE);
                gridClientes.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                gridClientes.setMinHeight(Region.USE_COMPUTED_SIZE);
                gridClientes.setPrefHeight(Region.USE_COMPUTED_SIZE);
                gridClientes.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     
}

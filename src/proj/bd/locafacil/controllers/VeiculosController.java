package proj.bd.locafacil.controllers;

import proj.bd.locafacil.controllers.cards.CardVeiculosController;
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
import proj.bd.locafacil.intermediarios.IntermediarioVeiculo;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Veiculos;

public class VeiculosController implements Initializable {

    @FXML
    protected void botCadastroVeiculo(ActionEvent e) {
        System.out.println("CadastrarVeiculo");
        LocaFacil_2_Apresentacao.changeConteudo("cadastroVeiculo");
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
    private ScrollPane listaVeiculos;

    @FXML
    private GridPane gridVeiculos;
    
    private IntermediarioVeiculo intermediarioVeiculo;
    
    private List<Veiculos> veiculos = new ArrayList<>();
    
    
    private List<Veiculos> getData() {
        List<Veiculos> veiculos = new ArrayList<>();
        Veiculos veiculo;
        
        veiculo = new Veiculos("String marca", "String modelo", "String cor", "String placa", 
                "String cambio", "String direcao", 1.2, true, true, 0.9, 99, "String dataaqusicao");
        veiculo.setModelo("Palio");
        veiculo.setDataaqusicao("08/45/3333");
        veiculo.setPlaca("986vcds");                            
        veiculos.add(veiculo);
        
        return veiculos;
    }
    
    private void setChosenVeiculo(Veiculos veiculo){        
        System.out.println("Mudando");
        LocaFacil_2_Apresentacao.changeConteudo("informacoesVeiculo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        veiculos.addAll(getData());
        
        if (veiculos.size() > 0) {            
            intermediarioVeiculo = new IntermediarioVeiculo(){
                @Override
                public void onClickIntermediario(Veiculos veiculo) {
                    setChosenVeiculo(veiculo);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < veiculos.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/proj/bd/locafacil/views/cards/CardVeiculos.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                CardVeiculosController cardVeiculosController = fxmlLoader.getController();
                cardVeiculosController.setData(veiculos.get(i), intermediarioVeiculo);

                if (column == 1) {
                    column = 0;
                    row++;
                }

                gridVeiculos.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                gridVeiculos.setMinWidth(Region.USE_COMPUTED_SIZE);
                gridVeiculos.setPrefWidth(Region.USE_COMPUTED_SIZE);
                gridVeiculos.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                gridVeiculos.setMinHeight(Region.USE_COMPUTED_SIZE);
                gridVeiculos.setPrefHeight(Region.USE_COMPUTED_SIZE);
                gridVeiculos.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     
}

package proj.bd.locafacil.controllers;

import proj.bd.locafacil.controllers.cards.CardAlugueisController;
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
import proj.bd.locafacil.intermediarios.IntermediarioAluguel;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Aluguel;

public class AlugueisController implements Initializable {
    
    @FXML
    protected void botCadastroAluguel(ActionEvent e) {
        System.out.println("CadastrarAluguel");
        LocaFacil_2_Apresentacao.changeConteudo("cadastroAluguel");
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
    private ScrollPane listaAlugueis;

    @FXML
    private GridPane gridAlugeis;
    
    private IntermediarioAluguel intermediarioAluguel;
    
    private List<Aluguel> alugueis = new ArrayList<>();
        
    private List<Aluguel> getData() {
        List<Aluguel> alugueis = new ArrayList<>();
        Aluguel aluguel;
        
        aluguel = new Aluguel();
        aluguel.setId_alu(001);        
        aluguel.setDataFim("20/12/4321");
        aluguel.setDataInicio("20/12/4321");
        alugueis.add(aluguel);
        
        return alugueis;
    }
    
    private void setChosenAluguel(Aluguel Aluguel){        
        System.out.println("Mudando");
        LocaFacil_2_Apresentacao.changeConteudo("informacoesAluguel");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alugueis.addAll(getData());
        
        if (alugueis.size() > 0) {            
            intermediarioAluguel = new IntermediarioAluguel(){
                @Override
                public void onClickIntermediario(Aluguel aluguel) {
                    setChosenAluguel(aluguel);
                }
            };
        }
        int column = 0;
        int row = 1;
        try {
            for (int i = 0; i < alugueis.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/proj/bd/locafacil/views/cards/CardAlugueis.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                CardAlugueisController cardAlugueisController = fxmlLoader.getController();
                cardAlugueisController.setData(alugueis.get(i), intermediarioAluguel);

                if (column == 1) {
                    column = 0;
                    row++;
                }

                gridAlugeis.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                gridAlugeis.setMinWidth(Region.USE_COMPUTED_SIZE);
                gridAlugeis.setPrefWidth(Region.USE_COMPUTED_SIZE);
                gridAlugeis.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                gridAlugeis.setMinHeight(Region.USE_COMPUTED_SIZE);
                gridAlugeis.setPrefHeight(Region.USE_COMPUTED_SIZE);
                gridAlugeis.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }     
}

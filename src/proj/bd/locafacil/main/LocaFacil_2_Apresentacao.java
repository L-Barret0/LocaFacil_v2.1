package proj.bd.locafacil.main;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proj.bd.locafacil.controllers.edicoes.EdicaoAdmController;
import proj.bd.locafacil.controllers.edicoes.EdicaoAluguelController;
import proj.bd.locafacil.controllers.edicoes.EdicaoClienteController;
import proj.bd.locafacil.controllers.edicoes.EdicaoVeiculoController;

public class LocaFacil_2_Apresentacao extends Application {
            
    public static void main(String[] args) {
        launch(args);
    }
    
    private static Stage stage;
    
    private static Scene loginScene;
    private static Scene principalScene;
    private static Scene clientesScene;
    private static Scene veiculosScene;
    private static Scene alugueisScene;
    private static Scene configuracoesScene;
    
    private static Scene cadastroAdmScene;
    private static Scene cadastroAluguelScene;
    private static Scene cadastroClienteScene;
    private static Scene cadastroVeiculoScene;
    
    private static Scene informacoesAluguelScene;
    private static Scene informacoesClienteScene;
    private static Scene informacoesVeiculoScene;
    
    private static Scene edicaoVeiculoScene;
    private static Scene edicaoAluguelScene;
    private static Scene edicaoAdmScene; 
    private static Scene edicaoClienteScene; 
    
        
    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        
        Parent loginFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Login.fxml"));        
        
        Parent principalFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Principal.fxml"));
        Parent clientesFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Clientes.fxml"));
        Parent veiculosFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Veiculos.fxml"));
        Parent alugueisFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Alugueis.fxml"));
        Parent configuracoesFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/Configuracoes.fxml"));

        Parent cadastroAdmFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/cadastros/CadastroAdm.fxml"));
        Parent cadastroAluguelFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/cadastros/CadastroAluguel.fxml"));
        Parent cadastroClienteFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/cadastros/CadastroCliente.fxml"));
        Parent cadastroVeiculoFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/cadastros/CadastroVeiculo.fxml"));
        
        Parent informacoesAluguelFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/informacoes/InformacoesAluguel.fxml"));
        Parent informacoesClienteFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/informacoes/InformacoesCliente.fxml"));
        Parent informacoesVeiculoFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/informacoes/InformacoesVeiculo.fxml"));
        
        Parent edicaoVeiculoFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/edicoes/EdicaoVeiculo.fxml"));
        Parent edicaoAdmFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/edicoes/EdicaoAdm.fxml"));
        Parent edicaoAluguelFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/edicoes/EdicaoAluguel.fxml"));
        Parent edicaoClienteFxml = FXMLLoader.load(getClass().getResource("/proj/bd/locafacil/views/edicoes/EdicaoCliente.fxml"));
    
        loginScene = new Scene(loginFxml);
        
        principalScene = new Scene(principalFxml);
        clientesScene = new Scene(clientesFxml);
        veiculosScene = new Scene(veiculosFxml);
        alugueisScene = new Scene(alugueisFxml);
        configuracoesScene = new Scene(configuracoesFxml);
        
        cadastroAdmScene = new Scene(cadastroAdmFxml);
        cadastroAluguelScene = new Scene(cadastroAluguelFxml);
        cadastroClienteScene = new Scene(cadastroClienteFxml);
        cadastroVeiculoScene = new Scene(cadastroVeiculoFxml);
                
        informacoesAluguelScene = new Scene(informacoesAluguelFxml);
        informacoesClienteScene = new Scene(informacoesClienteFxml);
        informacoesVeiculoScene = new Scene(informacoesVeiculoFxml);
        
        edicaoVeiculoScene = new Scene(edicaoVeiculoFxml);
        edicaoAdmScene = new Scene(edicaoAdmFxml);
        edicaoAluguelScene = new Scene(edicaoAluguelFxml);
        edicaoClienteScene = new Scene(edicaoClienteFxml);
            
        primaryStage.setTitle("Sistema para Gerenciamento de Locação de Automoveis");
        primaryStage.setScene(loginScene);
        primaryStage.show();        
    }
    
    public static void changeConteudo(String conteudo, Object parametro){
        switch(conteudo){
            case "login":
                stage.setScene(loginScene);
                notificaTodaLista("login", parametro);
            break;
            //
            case "principal":
                stage.setScene(principalScene);
                notificaTodaLista("principal", parametro);
            break;
            case "clientes":
                stage.setScene(clientesScene);
                notificaTodaLista("clientes", parametro);
            break;            
            case "veiculos":
                stage.setScene(veiculosScene);
                notificaTodaLista("veiculos", parametro);
            break;
            case "alugueis":
                stage.setScene(alugueisScene);
                notificaTodaLista("alugueis", parametro);
            break;
            case "confuguracoes":
                stage.setScene(configuracoesScene);
                notificaTodaLista("confuguracoes", parametro);
            break;
            //
            case "cadastroAdm":
                stage.setScene(cadastroAdmScene);
                notificaTodaLista("cadastroAdm", parametro);
            break;
            case "cadastroAluguel":
                stage.setScene(cadastroAluguelScene);
                notificaTodaLista("cadastroAluguel", parametro);
            break;
            case "cadastroCliente":
                stage.setScene(cadastroClienteScene);
                notificaTodaLista("cadastroCliente", parametro);
            break;
            case "cadastroVeiculo":
                stage.setScene(cadastroVeiculoScene);
                notificaTodaLista("cadastroVeiculo", parametro);
            break;
            //                
            case "informacoesAluguel":
                stage.setScene(informacoesAluguelScene);
                notificaTodaLista("informacoesAluguel", parametro);
            break;
            case "informacoesCliente":
                stage.setScene(informacoesClienteScene);
                notificaTodaLista("informacoesCliente", parametro);
            break;
            case "informacoesVeiculo":
                stage.setScene(informacoesVeiculoScene);
                notificaTodaLista("informacoesVeiculo", parametro);
            break;
            //
            case "edicaoVeiculo":
                stage.setScene(edicaoVeiculoScene);
                notificaTodaLista("edicaoVeiculo", parametro);
            break;
            case "edicaoAdm":
                stage.setScene(edicaoAdmScene);
                notificaTodaLista("edicaoAdm", parametro);
            break;
            case "edicaoAluguel":
                stage.setScene(edicaoAluguelScene);
                notificaTodaLista("edicaoAluguel", parametro);
            break;
            case "edicaoCliente":
                stage.setScene(edicaoClienteScene);
                notificaTodaLista("edicaoCliente", parametro);
            break;
        }
    }
        
    public static void changeConteudo(String conteudo){
        changeConteudo(conteudo, null);
    }
    
    public static interface ModificadorConteudo {
        void instrumentoModificadorConteudo(String novaCena, Object parametro);
    }
    
    private static ArrayList<ModificadorConteudo> listaConteudo = new ArrayList<>();
    
    public static void addPassagemConteudoLista(ModificadorConteudo novaLista) {
        listaConteudo.add(novaLista);
    }
    
    private static void notificaTodaLista(String novaCena, Object parametro) {
        for(ModificadorConteudo l : listaConteudo){
            l.instrumentoModificadorConteudo(novaCena, parametro);
        }
    }    
}

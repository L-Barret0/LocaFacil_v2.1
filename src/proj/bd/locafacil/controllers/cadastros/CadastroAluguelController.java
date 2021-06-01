package proj.bd.locafacil.controllers.cadastros;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import proj.bd.locafacil.main.LocaFacil_2_Apresentacao;
import proj.bd.locafacil.models.Aluguel;
import proj.bd.locafacil.models.Cliente;
import proj.bd.locafacil.models.Veiculos;

public class CadastroAluguelController implements Initializable {

    @FXML
    protected void botCancelarCadastroAlugel(ActionEvent e) {
        System.out.println("CadastroAluguel cancelado");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
    }
    
    // Inicio ComboBox
    @FXML
    private ComboBox<Cliente> comboBoxClientes_Aluguel;
    @FXML
    private ComboBox<Veiculos> comboBoxVeiculos_Aluguel;
    
    private List<Cliente> clientes = new ArrayList<>();
    private List<Veiculos> veiculos = new ArrayList<>();
    
    private ObservableList<Cliente> obsClientes;
    private ObservableList<Veiculos> obsVeiculos;
            
    public void carregarComboBoxCliente(){        
        Cliente cliente = new Cliente(1, "Francisco", "9856.65.344-77", "String email");
        clientes.add(cliente);
        
        obsClientes = FXCollections.observableArrayList(clientes);
        
        comboBoxClientes_Aluguel.setItems(obsClientes);               
    }
    
    public void carregarComboBoxVeiculo(){ 
        Veiculos veiculo1 = new Veiculos(1, "fiat Toro");
        veiculos.add(veiculo1);
        
        Veiculos veiculo2 = new Veiculos(2, "prisma");
        veiculos.add(veiculo2);
                
        obsVeiculos = FXCollections.observableArrayList(veiculos);
                
        comboBoxVeiculos_Aluguel.setItems(obsVeiculos);        
    }
    
    public void entregarValoresComboBoxCliente(){ 
        Cliente cliente = comboBoxClientes_Aluguel.getSelectionModel().getSelectedItem();
        System.out.println("Cliente:" + cliente.getNome());
    }
    
    public int entregarValoresComboBoxVeiculo(){ 
        Veiculos Veiculo = comboBoxVeiculos_Aluguel.getSelectionModel().getSelectedItem();
        System.out.println("ID: " + Veiculo.getId_ve()+ " - Modelo:" + Veiculo.getModelo());                
        
        return Veiculo.getId_ve();
    }
    // Fim ComboBox
    
    //-----Informações
    @FXML
    private TextField tfCadastroAluguelDataLocacao;

    @FXML
    private TextField tfCadastroAluguelDataEntrega;

    @FXML
    private TextField tfCadastroAluguelValor;
    
    @FXML
    protected void botCadastroAlugelCadastrar(ActionEvent e) {
        
        try {
            
            if(tfCadastroAluguelDataLocacao.getText().isEmpty())
                throw new RuntimeException("É obrigatório informar a data de locação!!");
            if(tfCadastroAluguelDataEntrega.getText().isEmpty())
                throw new RuntimeException("É obrigatório informar a data de entrega!!");
            if(tfCadastroAluguelValor.getText().isEmpty())
                throw new RuntimeException("É obrigatório informar informar o valor do aluguel!!");
            //if(passCadastroAdmSenha.getText().isEmpty())
                //throw new RuntimeException("O atributo Senha é obrigatório!!");
            //if(passCadastroAdmConfirmarSenha.getText().isEmpty())
                //throw new RuntimeException("É obrigatório a confirmação da senha!!");
            
            /*Aluguel aluguel = new Aluguel(                    
                    tfCadastroAluguelDataLocacao.getText(),
                    tfCadastroAluguelDataEntrega.getText(),
                    tfCadastroAluguelValor.getText()),
                    
                    //-----Ajeitar o Id para passar referencia
                    entregarValoresComboBoxVeiculo().getIn();
                           */       
                //ins.insertAdm(adm);
                //LocaFacil_2_Apresentacao.changeConteudo("login");
            
        }catch (RuntimeException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao cadastrar Administrador");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
        /*
        entregarValoresComboBoxVeiculo();
        entregarValoresComboBoxCliente();
        System.out.println("CadastroAluguel realizados");
        LocaFacil_2_Apresentacao.changeConteudo("alugueis");
        */
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarComboBoxCliente();
        carregarComboBoxVeiculo();
    }    
    
}

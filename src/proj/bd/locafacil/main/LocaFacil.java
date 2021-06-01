package proj.bd.locafacil.main;

import proj.bd.locafacil.models.Administrador;
import proj.bd.locafacil.models.Aluguel;
import proj.bd.locafacil.models.Cliente;
import proj.bd.locafacil.models.Veiculos;
import java.text.ParseException;
import proj.bd.locafacil.data.Busca;
import proj.bd.locafacil.data.Conexao;
import proj.bd.locafacil.data.Edit;
import proj.bd.locafacil.data.Insert;
import proj.bd.locafacil.data.Delete;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proj.bd.locafacil.data.CreateTable;


public class LocaFacil {

    public static void main(String[] args) throws ParseException, SQLException {
        Conexao con = new Conexao();
        Insert ins = new Insert();
        Busca busca = new Busca();
        Edit edt = new Edit();
        Delete del = new Delete();
        
        ArrayList<Cliente> listaCliente = new ArrayList();
        ArrayList<Veiculos> listaVeiculo = new ArrayList();
        ArrayList<Aluguel> listaAluguel = new ArrayList();
        
        //Criar tabelas
        CreateTable criaTabelas = new CreateTable();
        //criaTabelas.criaTabalas(); //Execute este método para criar as tabelas
        
        //Administrador: Criar, Buscar, Editar e deletar
        Administrador adm = new Administrador("João José  Jaime Junqueira", "12345678901", "jjoaoj@gmail.com", "12345678");
        //Obs: quando se cria um ADM não precisa enviar ID, nos outros métodos o objeto ADM precisa do ID.
        ins.insertAdm(adm);
        //adm = busca.buscaAdmEmail("jjjj@gmail.com");
        //edt.editAdm(adm);
        //del.deleteAdm(2);
        
        //Cliente: Criar, Buscar, Editar e deletar
        Cliente cl = new Cliente("Claudio Rocha", "09876543210", "craudio@gmail.com", "11151618", "26/08/1995", "8466666666", 
                "Num Tem", "Sumiu", 5, 59000000, "Cada dele");
        //ins.insertCliente(cl, 3);
        //listaCliente = busca.buscaCliente();
        //listaCliente = busca.buscaClienteNome("Claudio Rocha");
        /*for(int i=0; i<(listaCliente.size()); i=i+1 ){
            System.out.println(listaCliente.get(i).toString());
        }*/
        //cl = busca.buscaClienteId(3);
        //edt.editCliente(cl, 1);
        //del.deleteCliente(3);
        
        //Veículos: Criar, Buscar, Editar e deletar
        Veiculos ve = new Veiculos(3, "VolksWagen", "Polo", "Preto", "kfr-889", 
                "manual", "hidráulica", 1.0, true, false,
                45000.00, 2019, "12/8/2020");
        //ins.insertVeiculo(ve, 3);
        //listaVeiculo = busca.buscaVeiculo();
        //listaVeiculo = busca.buscaVeiculoModelo("Polo");
        /*for(int i=0; i<(listaVeiculo.size()); i=i+1){
            System.out.println(listaVeiculo.get(i).toString());
        }*/
        //ve = busca.buscaVeiculoId(1);
        //edt.editVeiculo(ve, 3);
        //del.deleteVeiculo(2);
        
        
        //Veículos: Criar, Buscar, Editar e deletar
        Aluguel alu = new Aluguel(8, "09/12/2020", "09/01/2021", 2500.00, 4, 3);
        //ins.insertAluguel(alu, 1);
        //listaAluguel = busca.buscaAluguel();
        //alu = busca.buscaAluguelId(8);
        //listaAluguel = busca.buscaAluguelIdCliente(1);
        /*for(int i=0; i<(listaAluguel.size()); i=i+1){
            System.out.println(listaAluguel.get(i).toString());
        }*/
        //edt.editAluguel(alu, 1);
        //del.deleteAluguel(4);
        
    }
    
}

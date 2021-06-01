
package proj.bd.locafacil.data;

public class CreateTable {
    public void criaTabalas(){
        Conexao con = new Conexao();
        String sql = "create table administrador(id_adm serial,"
                    + "nome_adm character varying,cpf_adm character varying not null unique,"
                    + "email_adm character varying unique, senha_adm character varying,"
                    + "primary key (id_adm))";
        
        con.execute(sql);
        
        sql = "create table cliente(id_cl serial,nome_cl character varying,"
                    + "cpf_cl character varying not null unique,email_cl character varying unique,"
                    + "numeroCNH_cl character varying,nascimento_cl date,"
                    + "telefone_cl character varying,endCidade_cl character varying,endRua_cl character varying,"
                    + "endNumero_cl int,endCEP_cl int,endBairro_cl character varying,primary key (id_cl))";
        
        con.execute(sql);
        
        sql = "create table veiculo(id_ve serial,marca_ve character varying,"
                    + "modelo_ve character varying,cor_ve character varying,placa_ve character varying not null unique,"
                    + "cambio_ve character varying,direcao_ve character varying,potencia_ve float,vidrosEletricos_ve boolean,"
                    + "arCondicionado_ve boolean,anoFabricacao_ve int,valor_ve float,dataAquisicao_ve date,"
                    + "primary key (id_ve))";
        
        con.execute(sql);
        
        sql = "create table aluguel(id_alu serial,dataInicio_alu date,dataFim_alu date,"
                    + "valor_alu real,id_cl int,id_ve int,primary key (id_alu),foreign key (id_cl) references cliente,"
                    + "foreign key (id_ve) references veiculo)";
        
        con.execute(sql);
        
        sql = "create table gerenciacliente(\n" +
                    "id_adm int,\n" +
                    "id_cl int,\n" +
                    "acao character varying)";
        
        con.execute(sql);
        
        sql = "create table gerenciaveiculo(\n" +
                    "id_adm int,\n" +
                    "id_ve  int,\n" +
                    "acao character varying)";
        
        con.execute(sql);
        
        sql = "create table gerencialuguel(\n" +
                    "id_adm int,\n" +
                    "id_alu  int,\n" +
                    "acao character varying)";
        
        con.execute(sql);
    }
}


package proj.bd.locafacil.data;

import proj.bd.locafacil.models.Administrador;
import proj.bd.locafacil.models.Aluguel;
import proj.bd.locafacil.models.Cliente;
import proj.bd.locafacil.models.Veiculos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Yasmim
 */
public class Edit {
       public void editAdm(Administrador adm){
         
         String sql = "UPDATE administrador SET"
                 + " nome_adm ='"+adm.getNome()+"',cpf_adm = '"+adm.getCpf()+
                "',email_adm = '"+adm.getEmail()+"',senha_adm = '"+adm.getSenha()+"'WHERE id_adm = "+adm.getId_admin()+";";
          
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
       
       
       public void editCliente(Cliente cl, int id_adm){
         
         String sql = "UPDATE cliente SET"
                + " nome_cl ='"+cl.getNome()+"',cpf_cl = '"+cl.getCpf()+
                "',email_cl = '"+cl.getEmail()+"', numerocnh_cl = '"+cl.getCnh()+
                "',nascimento_cl = '"+cl.getDataNascimento()+"',telefone_cl = '"+cl.getTelefone()+
                "',endcidade_cl = '"+cl.getEndCidade()+"', endrua_cl = '"+cl.getEndRua()+
                "',endnumero_cl = "+cl.getEndNumero()+",endcep_cl = "+cl.getEndCEP()+
                ", endbairro_cl = '"+cl.getEndBairro()+"'WHERE id_cl = "+cl.getId_cl()+";";
        
        Conexao con = new Conexao();
        con.execute(sql);
        sql = "INSERT INTO gerenciacliente (id_adm,id_cl,acao) VALUES("+id_adm+","+cl.getId_cl()+",'Edição de Cliente')";
        con.execute(sql);
       }
      
       
      public void editVeiculo(Veiculos ve, int id_adm){
         
       
        String sql = "UPDATE veiculo SET marca_ve ='"+ve.getMarca()+"',modelo_ve= '"+ve.getModelo()+
                "',cor_ve = '"+ve.getCor()+"', placa_ve = '"+ve.getPlaca()+
                "',cambio_ve= '"+ve.getCambio()+"',direcao_ve = '"+ve.getDirecao()+
                "',potencia_ve= "+ve.getPotencia()+", vidroseletricos_ve = "+ve.getVidroseletricos()+
                ",arcondicionado_ve = "+ve.getArcondicionado()+",anofabricacao_ve = '"+ve.getAnofabricacao()+
                "', valor_ve = "+ve.getValor()+" ,dataaquisicao_ve = '"+ve.getDataaqusicao()+"'"
                + "WHERE id_ve = "+ve.getId_ve()+";";
        Conexao con = new Conexao();
        con.execute(sql);
        sql = "INSERT INTO gerenciaveiculo (id_adm,id_ve,acao) VALUES("+id_adm+","+ve.getId_ve()+",'Edição de veiculo')";
        con.execute(sql);
       }
      
      
      
      
         public void editAluguel(Aluguel alu, int id_adm){
         
       
        String sql = "UPDATE aluguel SET"
                + " dataInicio_alu ='"+alu.getDataInicio()+"',dataFim_alu= '"+alu.getDataFim()+
                "', valor_alu = "+alu.getValor()+", id_cl= "+alu.getId_cl()+", id_ve= "+alu.getId_ve()+
                " WHERE id_alu = "+alu.getId_alu()+";";
        
        Conexao con = new Conexao();
        con.execute(sql);
        sql = "INSERT INTO gerencialuguel (id_adm,id_alu,acao) VALUES("+id_adm+","+alu.getId_alu()+",'Edição de Aluguel')";
        con.execute(sql);
       }
}

package proj.bd.locafacil.data;

public class Delete{
       
       public void deleteAdm(int id_adm){
         
        String sql = "DELETE FROM ADMINISTRADOR WHERE id_adm ="+id_adm;
         
         //System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
      
       public void deleteCliente(int id_cl){
           
         String sql = "DELETE from cliente WHERE id_cl="+id_cl;
         //System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
       
      public void deleteVeiculo(int id_ve){
         
       
         String sql = "DELETE from veiculo WHERE id_ve ="+id_ve;
              
         //System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
      
         public void deleteAluguel(int id_alu){
         
       
         String sql = "DELETE from aluguel WHERE id_alu="+id_alu;
         
         //System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
    
    
}

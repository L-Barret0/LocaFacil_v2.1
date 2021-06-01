package proj.bd.locafacil.models;

public class Cliente extends Pessoa {
    
        private int id_cl;
	private String cnh;
        private String dataNascimento;
        private String endCidade;
        private String endRua;
        private String endBairro;
        private String telefone;
        private int endNumero;
        private int endCEP;
   
	public Cliente(int id_cl, String nome, String cpf, String email, String cnh, String dataNascimento, String telefone, 
            String endCidade, String endRua, int endNumero, int endCEP, String endBairro) {
		super(cpf, nome, email);
		this.id_cl = id_cl;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
                this.endCidade = endCidade;
		this.endRua= endRua;
		this.endNumero= endNumero;
                this.endCEP= endCEP;
                this.endBairro= endBairro;			
	}
                
        public Cliente(String nome, String cpf, String email, String cnh, String dataNascimento, String telefone, 
            String endCidade, String endRua, int endNumero, int endCEP, String endBairro) {
		super(cpf, nome, email);
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
                this.endCidade = endCidade;
		this.endRua= endRua;
		this.endNumero= endNumero;
                this.endCEP= endCEP;
                this.endBairro= endBairro;	
	}
        
        public Cliente(int id_cl, String nome, String cpf, String email) {
		super(cpf, nome, email);
		this.id_cl = id_cl;
        }
        public int getId_cl() {
            return id_cl;
        } 

        public void setId_cl(int id_cl) {
            this.id_cl = id_cl;
        }
                
         public String getCnh() {
            return cnh;
        }

        public void setCnh(String cnh) {
           this.cnh = cnh;
        }   
                 
        public String getDataNascimento() {
            return dataNascimento;
        } 

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
         
        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEndCidade() {
            return endCidade;
        }

        public void setEndCidade(String endCidade) {
            this.endCidade = endCidade;
        }

        public String getEndRua() {
            return endRua;
        }

        public void setEndRua(String endRua) {
            this.endRua = endRua;
        }
  
        public int getEndNumero() {
            return endNumero;
        }
        
        public void setEndNumero(int endNumero) {
            this.endNumero = endNumero;
        }
        public int getEndCEP() {
            return endCEP;
        }

        public void setEndCEP(int endCEP) {
             this.endCEP = endCEP;
        }
        
        public String getEndBairro() {
            return endBairro;
        }

        public void setEndBairro(String endBString) {
             this.endBairro = endBairro;
        }
        
        @Override
	public String toString() {
		return super.toString();
	}
}

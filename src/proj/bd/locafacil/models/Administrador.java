package proj.bd.locafacil.models;

public class Administrador extends Pessoa{
        private int id;
	private String senha;
	
	
	public Administrador(int id, String nome, String cpf, String email, String senha){
            super(cpf, nome, email);
            this.id = id;
            this.senha = senha;
	}
        
        public Administrador(String nome, String cpf, String email, String senha){
            super(cpf, nome, email);
            this.senha = senha;
	}
	
	public int getId_admin() {
		return id;
	}

	public void setId_admin(int id){
		this.id = id;
        }


	public String getSenha(){
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Administrador: Id: "+id+", "+super.toString()+", Senha: "+senha+"";
	}
}

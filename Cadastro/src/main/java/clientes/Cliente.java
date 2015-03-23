package clientes;

public class Cliente {

	String nome,sexo,estado;
	int ra;
	
	public Cliente(String nome, String sexo,int ra, String estado){
		setNome(nome);
		setRa(ra);
		setSexo(sexo);
		setEstado(estado);
	}
	

		public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
		
}

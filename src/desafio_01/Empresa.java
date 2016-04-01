package desafio_01;

public class Empresa {
	
	private String cnpj;
	private String nome;
	private String ramo;
	
	public Empresa(String cnpj, String nome, String ramo) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.ramo = ramo;
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	
	
	
	
}

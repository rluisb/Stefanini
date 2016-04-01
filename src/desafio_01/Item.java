package desafio_01;

public class Item {
	
	private int id;
	private int qtde;
	private double valor;

	public Item(int id, int qtde, double valor) {
		this.id = id;
		this.qtde = qtde;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}

package desafio_01;

import java.util.ArrayList;

public class Venda {
	
	private int idVenda;
	private Vendedor vendedor;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Venda(int idVenda, Vendedor vendedor, ArrayList<Item> itens) {
		this.idVenda = idVenda;
		this.vendedor = vendedor;
		this.itens = itens;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	
	
	
	
	
	
	
	
	
	
}

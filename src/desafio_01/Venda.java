package desafio_01;

import java.awt.List;
import java.util.ArrayList;

public class Venda {
	
	private String id;
	private Vendedor vendedor;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Venda(String id, Vendedor vendedor, ArrayList<Item> itens) {
		this.id = id;
		this.vendedor = vendedor;
		this.itens = itens;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

package desafio_01;

import java.util.TreeMap;

public class Repositorio {
	
	private TreeMap<String, Vendedor> vendedores;
	private TreeMap<String, Empresa> empresas;
	private TreeMap<String, Venda> vendas;
	
	public Repositorio() {
		this.vendedores = new TreeMap<String, Vendedor>();
		this.empresas = new TreeMap<String, Empresa>();
		this.vendas = new TreeMap<String, Venda>();
	}

	public TreeMap<String, Vendedor> getVendedores() {
		return vendedores;
	}

	public void insereVendedor(Vendedor vendedor) {
		this.vendedores.put(vendedor.getCpf(), (Vendedor) vendedor);
	}

	public TreeMap<String, Empresa> getEmpresas() {
		return empresas;
	}

	public void insereEmpresa(Empresa empresa) {
		this.empresas.put(empresa.getCnpj(), (Empresa) empresa);
	}

	public TreeMap<String, Venda> getVendas() {
		return vendas;
	}

	public void insereVenda(Venda venda) {
		String idVenda = String.valueOf(venda.getIdVenda());
		this.vendas.put(idVenda,(Venda) venda);
	}
	
	
	public Vendedor buscaPorCpf(String nome){
		return vendedores.get(nome);
	}
	
	
	
	
	

}

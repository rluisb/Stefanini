package desafio_01;

import java.util.TreeMap;

public class Repositorio {
	
	private TreeMap<String,Vendedor> vendedores;
	private TreeMap<String,Empresa> empresas;
	private TreeMap<String,Venda> vendas;

	public Repositorio() {
		this.vendedores = new TreeMap<String,Vendedor>();
		this.empresas = new TreeMap<String,Empresa>();
	}

	public TreeMap<String, Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(TreeMap<String, Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public TreeMap<String, Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(TreeMap<String, Empresa> empresas) {
		this.empresas = empresas;
	}

	public TreeMap<String, Venda> getVendas() {
		return vendas;
	}

	public void setVendas(TreeMap<String, Venda> vendas) {
		this.vendas = vendas;
	}
	
	
	public void adicionaVendedor(Vendedor vendedor){
		vendedores.put(vendedor.getNome(), vendedor);
	}
	
	public void adicionaEmpresa(Empresa empresa){
		empresas.put(empresa.getNome(), empresa);
	}
	
	

}

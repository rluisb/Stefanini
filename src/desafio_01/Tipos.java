package desafio_01;

import java.util.ArrayList;
import java.util.Map.Entry;

public enum Tipos {
	
	VENDEDOR("001"){

		@Override
		public Vendedor montaObjeto(String nomeVendedor, String cpfVendedor, String salarioVendedor, Repositorio repositorio) {
			Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, Double.parseDouble(salarioVendedor)); 
			repositorio.insereVendedor(vendedor);
			return vendedor;
			
		}
		
	},
	
	EMPRESA("002"){

		@Override
		public Empresa montaObjeto(String nomeEmpresa, String cnpjEmpresa, String ramoEmpresa, Repositorio repositorio) {
			Empresa empresa = new Empresa(nomeEmpresa, cnpjEmpresa, ramoEmpresa);
			repositorio.insereEmpresa(empresa);
			return empresa;
		}


	},
	
	VENDA("003"){

		@Override
		public Venda montaObjeto(String idVenda, String vendedor, String produtos, Repositorio repositorio) {
			String itens = produtos;
			String[] linhaItem = itens.substring(1, itens.length()-1).split(",");
			ArrayList<Item> listaDeItens = new ArrayList<Item>();
			
			for (String string : linhaItem) {
					String[] camposItem = string.split("-");
					listaDeItens.add(new Item(Integer.parseInt(camposItem[0]), Integer.parseInt(camposItem[1]), Double.parseDouble(camposItem[2])));
			}
			 Vendedor vendedorEcontrado = repositorio.buscaPorCpf(vendedor);
					
			Venda venda = new Venda(Integer.parseInt(idVenda), vendedorEcontrado, listaDeItens);
			repositorio.insereVenda(venda);
			return venda;
		}

		
		
		
	};

	private String tipo;

	private Tipos(String tipo) {
		this.tipo = tipo;
	}

	
	public String getTipo() {
		return tipo;
	}

	public abstract Object montaObjeto(String a, String b, String c, Repositorio repositorio);
	
	public  int contaCliente(Repositorio repositorio){
		int count = 0;
		for(Entry<String, Vendedor> mapaVendedores : repositorio.getVendedores().entrySet()){
			if(repositorio.getVendedores().equals(mapaVendedores.getKey())){
				count = count;
			}else{
				count++;
			}
		}
		return 0;
	}
	

	
	
	

}

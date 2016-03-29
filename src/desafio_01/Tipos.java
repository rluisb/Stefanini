package desafio_01;

public enum Tipos {
	
	VENDEDOR("001"){

		@Override
		public void montaObjeto(String[] dados, Repositorio repositorio) {
			repositorio.adicionaVendedor(new Vendedor(dados[0], dados[1], dados[2], dados[3]));
			
		}
		
	},
	
	EMPRESA("002"){

		@Override
		public void montaObjeto(String[] dados, Repositorio repositorio) {
			repositorio.adicionaEmpresa(new Empresa(dados[0], dados[1], dados[2], dados[3]));
			
		}

		
		
	},
	
	VENDA("003"){

		@Override
		public void montaObjeto(String[] dados, Repositorio repositorio) {
			// TODO Auto-generated method stub
			
		}

		
		
	};
		
	
	
	
	
	private String tipo;

	private Tipos(String tipo) {
		this.tipo = tipo;
	}

	
	public String getTipo() {
		return tipo;
	}
	
	
	
	public abstract void montaObjeto(String[] dados, Repositorio repositorio); 

}

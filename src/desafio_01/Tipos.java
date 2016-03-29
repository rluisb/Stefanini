package desafio_01;

public enum Tipos {
	
	VENDEDOR("001"){

		
	},
	
	EMPRESA("002"){

	},
	
	VENDA("003"){
		
	};
		
	
	
	
	
	private String tipo;

	private Tipos(String tipo) {
		this.tipo = tipo;
	}

	
	public String getTipo() {
		return tipo;
	}
	
	
	

}

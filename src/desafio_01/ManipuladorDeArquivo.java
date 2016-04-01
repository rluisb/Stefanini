package desafio_01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ManipuladorDeArquivo {
	
	private String homeUser = System.getProperty("user.home");
	private String entrada = "/data/in";
	private String saida = "/data/out";
	private String path = homeUser + entrada;
	
	
	public List<Path> leitorDeArquivo() throws IOException{
			return Files.list(new File(path).toPath())
		        .filter(arquivo -> arquivo.toFile().isFile())
		        .filter(arquivo -> arquivo.toFile().getAbsolutePath().endsWith(".dat"))
		        .collect(Collectors.toList());
		
	}
	public void lerLinha(String linha, Repositorio repositorio) {
		String[] campos = linha.split("ç");
		String id = campos[0];
		
		if (id.equals(Tipos.VENDEDOR.getTipo())){
			Tipos.VENDEDOR.montaObjeto(campos[1], campos[2], campos[3], repositorio);
		}
		
		else if (id.equals(Tipos.VENDA.getTipo())){
			Tipos.VENDA.montaObjeto(campos[0], campos[1], campos[2], repositorio);
		}
		
		else if (id.equals(Tipos.EMPRESA.getTipo())){
			Tipos.EMPRESA.montaObjeto(campos[1], campos[2], campos[3], repositorio);
		}
	}
}

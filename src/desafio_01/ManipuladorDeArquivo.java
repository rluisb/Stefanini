package desafio_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ManipuladorDeArquivo {
	
	private String homeUser = System.getProperty("user.home");
	private String entrada = "/data/in";
	private String saida = "/data/out";
	private String path = homeUser + entrada;
	private int i;
	
	
	public List<Path> leitorDeArquivo() throws IOException{
			return Files.list(new File(path).toPath())
		        .filter(arquivo -> arquivo.toFile().isFile())
		        .filter(arquivo -> arquivo.toFile().getAbsolutePath().endsWith(".dat"))
		        .collect(Collectors.toList());
		
	}
	public void lerLinha(String linha) {
		String[] campos = linha.split("ç");
		String id = campos[0];
		
		if (id.equals(Tipos.VENDA.getTipo())){
			String itens = campos[2];
			String[] camposItem = itens.substring(1, itens.length()-1).split(",");
			
			for (String string : camposItem) {
				System.out.println(string);
			}
		}
		
	}
}

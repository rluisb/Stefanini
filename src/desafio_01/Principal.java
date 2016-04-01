package desafio_01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Principal {

	private int i;

	private final Repositorio repositorio = new Repositorio();
	
	public static void main(String[] args) throws Exception {
		new Principal();
	}
	
	public Principal() throws Exception {
		ManipuladorDeArquivo manipulador = new ManipuladorDeArquivo();
		
		for(i = 0; i< manipulador.leitorDeArquivo().size();i++){
			List<Path> arquivosDat = manipulador.leitorDeArquivo();
			for (Path path : arquivosDat) {
				List<String> linhas = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
				for (String linha : linhas) {
					manipulador.lerLinha(linha, repositorio);
				}
			}
		}
		
		for(String nome : repositorio.getVendedores().keySet()) {
			System.out.println(nome);
		}
	}
}
	
			

		 
	



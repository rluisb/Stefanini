package desafio_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Principal {

	private static int i;

	public static void main(String[] args) throws IOException {
		String id;
		ManipuladorDeArquivo manipulador = new ManipuladorDeArquivo();
	 
		for(i = 0; i< manipulador.leitorDeArquivo().size();i++){
			List<Path> arquivosDat = manipulador.leitorDeArquivo();
			for (Path path : arquivosDat) {
				List<String> linhas = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
				for (String linha : linhas) {
					manipulador.lerLinha(linha);
				}
			}
			
		}
	}
}
	
			

		 
	



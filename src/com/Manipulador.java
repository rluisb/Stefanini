package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;


public class Manipulador {
	
	private static String path = "../desafio_02/";
	
	public List<Path> leitorDeArquivo() throws IOException{
		return Files.list(new File(path).toPath())
	        .filter(arquivo -> arquivo.toFile().isFile())
	        .filter(arquivo -> arquivo.toFile().getAbsolutePath().endsWith(".log"))
	        .collect(Collectors.toList());
	
	}
	public void lerLinha(String linha) {
		String[] campos = linha.split(" - - ");
		TreeMap<String, Acesso> listaDeAcessos = new TreeMap<String, Acesso>();
		 
		int bandwidthPositionBegin;
		int bandwidthPositionEnd;
		 
		for (String string : campos) {
			String[] simpleIp = campos[0].split(" - ");
			String[] access = campos[1].split("] ");
			Acesso acesso = new Acesso(simpleIp[1], access[0], access[1]);
			listaDeAcessos.put(simpleIp[1], acesso);
			
			if(listaDeAcessos.get(simpleIp[1]).getAccess().contains(".png")){
				if(listaDeAcessos.get(simpleIp[1]).getAccess().contains("200")){
					bandwidthPositionBegin = listaDeAcessos.get(simpleIp[1]).getAccess().indexOf(".png")+18;
					bandwidthPositionEnd = bandwidthPositionBegin + 8;
					String[] getBanwidth = listaDeAcessos.get(simpleIp[1]).getAccess().substring(bandwidthPositionBegin, bandwidthPositionEnd).split(" ");
					//System.out.println(getBanwidth[1]);
				}
				
			}
		}
		
	}
}

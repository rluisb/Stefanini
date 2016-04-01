package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
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
		TreeMap<String, Acesso> acessos = new TreeMap<String, Acesso>();
		int totalBandwidth = 0;
		Acesso acessoEscolhido;
		
		for (String string : campos) {
			String[] simpleIp = campos[0].split(" - ");
			String[] access = campos[1].split("] ");
			String data = access[0].trim().substring(1, 17);
			String[] getBandwidth = access[1].split(" ");
			String typeFile;
			String statusOk = "200";
			
			if(string.contains(statusOk)){
				if(string.contains(".docx")){
					typeFile = "docx";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".txt")){
					typeFile = "txt";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".csv")){
					typeFile = "csv";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".png")){
					typeFile = "png";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".jpg")){
					typeFile = "jpg";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".gif")){
					typeFile = "gif";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".css")){
					typeFile = "css";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".js")){
					typeFile = "js";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}else if(string.contains(".i")){
					typeFile = "i";
					acessoEscolhido = acessos.get(typeFile);
					int banda = Integer.parseInt(getBandwidth[4]);
					totalBandwidth = acessoEscolhido.getBanda() + banda;
					acessos.put(typeFile, new Acesso(simpleIp[1], data, access[1], typeFile, totalBandwidth));
					
				}
			}
				
				for (Entry<String, Acesso> mapaAcessos : acessos.entrySet()) {
					typeFile = mapaAcessos.getKey();
					System.out.println(mapaAcessos.getKey() + " / " + mapaAcessos.getValue().getIpAccess());
				}
			
			
			
		}
	}
}


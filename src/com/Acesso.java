package com;

public class Acesso {
	
	private String ipAccess;
	private String dataTime;
	private String Access;
	private String typeFile;
	private int banda;
	
	public Acesso(String ipAccess, String dataTime, String access, String typeFile, int banda) {
		this.ipAccess = ipAccess;
		this.dataTime = dataTime;
		Access = access;
		this.typeFile = typeFile;
		this.banda = banda;
	}

	public String getIpAccess() {
		return ipAccess;
	}

	public void setIpAccess(String ipAccess) {
		this.ipAccess = ipAccess;
	}

	public String getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public String getAccess() {
		return Access;
	}

	public void setAccess(String access) {
		Access = access;
	}

	public String getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(String typeFile) {
		this.typeFile = typeFile;
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}
	
	
	
	
	
	
	 
	
	
	
	
	

	
	
	
	

	
	
	
	
	
	
	
}

package com.vega.springmvc.model;

public class ElementUri {
	private String fileName;
	private String ackUrl;
	private String key;
	
	public ElementUri(){}
	
	public ElementUri(String file) {
		fileName = file;
	}
	
	public ElementUri(String file, String ack, String key) {
		fileName = file;
		ackUrl = ack;
		this.key = key;
	}
	
	public String getAckUrl() {
		return ackUrl;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setAckUrl(String ackUrl) {
		this.ackUrl = ackUrl;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
}

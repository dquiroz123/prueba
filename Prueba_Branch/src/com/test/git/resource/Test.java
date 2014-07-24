package com.test.git.resource;

public class Test {
	
	private String saludo;
	
	public Test(){
		saludo = "Hola";
	} 
	
	public Test(String saludo){
		this.saludo = saludo;
	} 

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}

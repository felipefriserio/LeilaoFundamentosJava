package br.com.fiap.enumerador;

public enum TipoMoeda {
	REAL("R$");
	
	private String simbolo;
	
	TipoMoeda(String simbolo){
		this.simbolo = simbolo;
	}
	
	public String val(){
		return this.simbolo;
	}
}

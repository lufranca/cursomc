package com.lucianofranca.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCode() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			
			if(cod.equals(x.getCode())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID invalido: " + cod);
	}
}

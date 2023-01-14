package br.com.apideteste.projeto.model;

import lombok.Data;

@Data

public class UsuarioComLombok {
	private Integer id;

	private String nome;
	
	private String email;
	
	private String senha;
	
	private String telefone;
}

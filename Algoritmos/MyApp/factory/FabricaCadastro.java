# factory - FabricaCadastro

package factory;

import cadastro.Cadastro;

public class FabricaCadastro {
	public static Cadastro criarCadastro (String nome, String email, Long telefone) {
		if ((nome == null || email == null || telefone == null)) {
			System.out.println("valores inválidos");
			return null;
		}
	
		Cadastro cliente = new Cadastro();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		return cliente;
		
	}	
		
}	


Ferreira , Gabriel . moreira028 @ . gmail . com

Dados :  16 / 06 / 2021
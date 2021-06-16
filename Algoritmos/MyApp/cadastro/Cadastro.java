# cadastro - Cadastro

package cadastro;

public class Cadastro {
	
	// estudar os conceitos de classes wrappers e primitivas
	
	// criar os gets e sets, são disponibilizados pelo próprio framework do eclipse
	// E caso faltar algum, é só utilizar o comando get ou set + ctrl + espaço
		
		private Integer id;
		private String nome;
		private Long telefone;
		private String email;
		
		public Long getTelefone() {
			return telefone;
		}
		
		public void setTelefone(Long telefone) {
			this.telefone = telefone;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		Integer getId() {
			return id;
		}
		
		// método "void" não retorna nada.
		
		void setId(Integer id) {
			this.id = id;	
			
		}
}

Ferreira , Gabriel . moreira028 @ . gmail . com

Dados :  16 / 06 / 2021
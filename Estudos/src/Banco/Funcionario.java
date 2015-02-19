package Banco;

//criando a classe funcionário

class Funcionario {

	// criando os aatributos da classe funcionário
	String nome;
	String cpf;
	double salario;

}

// criando uma classe herança gerente da classe funcionário

class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {

			System.out.println("Acesso Negado!");
			return false;

		}

	}
}
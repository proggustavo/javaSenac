package lista_Heranca;

import java.util.Scanner;


public class executavelPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		pessoaFisica pessoaFisica = new pessoaFisica();	
		pessoaJuridica pj = new pessoaJuridica();
		
		
		// --------Pessoa Fisica 
		
		pessoaFisica.setNome("Gustavo Rodrigues");
		pessoaFisica.setRendaBruta(4300.00);
		pessoaFisica.setCpf(1111); 
		pessoaFisica.calcularImposto();
	
		System.out.println(pessoaFisica.getNome());
		System.out.println(pessoaFisica.getRendaBruta());
		System.out.println(pessoaFisica.getCpf());
		System.out.println(pessoaFisica.getimposto());
		
		
		
		
	//	pessoaFisica.setNome("Mario Silveira");
	//	pessoaFisica.setRendabruta(1.500);
	//	pessoaFisica.setCpf(2222);
		//pessoaFisica.imposto(2.300);
		
		
		//System.out.println(pessoaFisica.getNome());
		//System.out.println(pessoaFisica.getRendabruta());
		//System.out.println(pessoaFisica.getCpf());
		//System.out.println(pessoaFisica.getimposto());
		
		System.out.println("------------- Pessoa Jur�dica -----------");
		
		pj.setNome("SENAC");
		pj.setCnpj(12309822);
		pj.setRendaBruta(30000.0);
		System.out.println("Nome: " + pj.getNome());
		System.out.println("Imposto: " + pj.calcularImposto());
		
		System.out.println("------------- Pessoa Fis�ca -----------");
		
		pessoaFisica.setNome("Francisco");
		pessoaFisica.setCpf(1924329);
		pessoaFisica.setRendaBruta(5000.00);
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Imposto: " + pessoaFisica.calcularImposto());
		
		
		
		
	
		
		teclado.close();
		
	}

}

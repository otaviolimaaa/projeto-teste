package primeiro_projeto;
import java.util.Scanner;

public final class fluxograma_em_java {

	public fluxograma_em_java() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horatrab, valorhora, salbruto, saliqui, inss;
		
		//Instanciar class Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de Dados
		System.out.println ("Quantos horas você trabalhou?");
		horatrab = ler.nextDouble ();
		System.out.println ("Qual o valor da sua hora?");
		valorhora = ler.nextDouble ();
		
		//Processamento
		salbruto = horatrab * valorhora;
		inss = salbruto * 0.12;
		saliqui = salbruto - inss;
		
		//Saída de dados
		System.out.println ("O valor do seu salário bruto é:" + salbruto + ",");
		System.out.println ("E o seu salário líquido é:" + saliqui + ".");
		
		
		
		

	}

}

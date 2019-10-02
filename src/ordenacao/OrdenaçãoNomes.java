package ordenacao;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenaçãoNomes {
	public static void main (String[]args){
		Scanner ler = new Scanner (System.in);
		String nome[]=new String[5];
		int i;
		System.out.println("Informe os 5 nomes: \n");
		for(i=0; i<5; i++){
			nome[i]=ler.nextLine();
			
		}
		System.out.println("--------------------\n");
		System.out.println("Vetor Desordenado");
	
		for(i=0; i<5; i++){
			System.out.println(" "+nome[i]);}
	
		System.out.println("--------------------\n");
		System.out.println("Vetor Ordenado");
		
		Arrays.sort(nome);
		for(i=0; i<5; i++){
			System.out.println(" "+nome[i]);}
		
		
	}

}

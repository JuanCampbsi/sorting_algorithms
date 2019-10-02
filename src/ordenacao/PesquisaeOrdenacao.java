package ordenacao;
import java.util.Random;

public class PesquisaeOrdenacao {
	public static void main (String[] args){
		Random random = new Random();		
		int veta[] = new int [5];
		int i=0;
		int j=0;
		int aux;
		
		System.out.println("Vetor desordenado [A] desordenado \n" );
		
		for(i=0;i<5;i++){
			int numero = random.nextInt(100);
			veta [i] = numero;
			System.out.println(" " + veta[i]);}
		
		
		System.out.println("-------------------------------\n");
		System.out.println("Vetor [A] ordenado Selection Sort\n");
		
		for(i=0;i<5;i++){
			for (j=0; j<4;j++){
				if (veta[i]>veta[j]){
					aux=veta[i];
					veta[i]=veta[j];
					veta[j]=aux;}}}
		//Saída Vetor [A] ordenado Selection Sort
		for (i=0; i<5; i++){
			System.out.println(" "+veta[i]);}
		

		System.out.println("-------------------------------\n");
		System.out.println("Vetor [A] ordenado Bubble Sort\n");
		
		for(i=0; i<5; i++){
			for (j=0; j<4; j++){
				if(veta[j]<veta[j+1]){
					aux=veta[j];
					veta[j]=veta[j+1];
					veta[j+1]=aux;}}}
		//Saída Vetor [A] ordenado Bubble Sort
		for(i=0; i<5; i++){
			System.out.println(" "+veta[i]);}
		
		System.out.println("-------------------------------\n");
		System.out.println("Vetor [A] ordenado Insertion Sort\n");
		
		for (j=1; j<5; j++){
			aux=veta[j];
				for (i=j-1;(i>=0)&&(veta[i]>aux);i++){
					veta[i+1]=veta[i];
					veta[i+1]= aux;}}
		//Saída Vetor [A] ordenado Insertion Sort
		for (i=0; i<5; i++){
			System.out.println(" "+veta[i]);}
	}	
}

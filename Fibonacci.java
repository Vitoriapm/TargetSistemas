import java.util.Scanner;
public class Fibonacci{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		int seq, n, soma = 0, ultimo = 1, penultimo = 0;
		
		System.out.print("Total da sequência: ");
		seq = sc.nextInt();
		
		System.out.print("Informe um número para saber se ele pertence à sequência de Fibonacci: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= seq; i++) {
			soma = penultimo + ultimo;
			penultimo = ultimo;
			ultimo = soma;
			if(n == soma) {
				System.out.print(n + " pertence à sequência!");
			}
		}

		sc.close();
	}
}

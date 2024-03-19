public class Soma{
	public static void main(String[]args){
		int INDICE = 13, soma = 0, k = 0;
		
		while (k < INDICE) {
			k++;
			soma += k;
		}
		
		System.out.print("A soma de 1 até 13 é: " + soma);
	}
}

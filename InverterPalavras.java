import java.util.Scanner;
public class InverterPalavras{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra para vê-la invertida: ");
		String palavra = sc.nextLine();
		
		String palavraInv = "";
		
		for(int i = palavra.length() - 1; i>=0; i--) {
			palavraInv = palavraInv + palavra.charAt(i);
		}
		System.out.print(palavraInv);
		
		sc.close();
	}
}

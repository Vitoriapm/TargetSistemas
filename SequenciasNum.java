public class Sequencias{
	public static void main(String[]args){
		System.out.println("Completando o próximo elemento:");
		
		//alternativa a)
		int a = 1;
		System.out.print("a)");
		for(int i=1; i<=5; i++) {
			if(i<5) {
				System.out.print(a + ",");
			}else {
				System.out.println(a);
			}
			a+=2;
		}
	
		//alternativa b)
		int b = 2;
		System.out.print("b)");
		for(int i=1; i<=7; i++) {
			if(i<7) {
				System.out.print(b + ",");
			}else {
				System.out.println(b);
			}
			b*=2;
		}
		
		//alternativa c
		double c = 0;
		System.out.print("c)");
		for(int i=1; i<=8; i++) {
			c = Math.pow((i-1),2);
			int totalb = (int)c;
			if(i<8) {
			
				System.out.print(totalb + ",");
			}else {
				System.out.println(totalb);
			}
		}
		
		//alternativa d
		double d = 4;
		int seq = 4;
		System.out.print("d)");
		for(int i=1; i<=5; i++) {
			int totalD = (int)d;
			if(i<5) {			
				System.out.print(totalD + ",");
			}else {
				System.out.println(totalD);
			}
			d = Math.pow(seq, 2);
			seq+=2;
		}
		
		//alternativa e
		int e = 0, n1 = 1, n2 = 1;
		System.out.print("e)");
		for (int i=1; i<=7; i++) {
			if(i<7) {
				System.out.print(n2 + ",");
			}else {
				System.out.println(n2);
			}
			e = n2 + n1;
			n2 = n1;
			n1 = e;
		}
		
		//alternativa f não foi feita!
	}
}

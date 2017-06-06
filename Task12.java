
public class Task12 {
public static void main(String[] args) {
	
	for (int i = 100; i <= 999; i++) {
		
		int c = i%10;
		int ab = i/10;
		int b = ab%10;
		int a = ab/10;
				
		if(a!=b && a!=c && b!=c){
			System.out.print(i + " ");
		}
	}
}
}

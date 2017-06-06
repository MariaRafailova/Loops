import java.util.Scanner;

public class Task18 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number from 1 to 9:");
	int a = sc.nextInt();
	System.out.println("Please enter a number from 1 to 9::");
	int b = sc.nextInt();
	
	if(a>=1 && a<=9 && b>=1 && b<=9){
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.println(i + "*" + j + "=" + (i*j) + ";");
			}
		}
	}
	else {
		System.out.println("The numbers are not from 1 to 9");
	}
}
}

import java.util.Scanner;

public class Task14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number between 10 and 200:");
	int n = sc.nextInt();
	
	if (n>=10 && n<=200) {
		
		for (int i = n-1; i>0; i--) {			
			if(i%7==0){
				System.out.print(i + " ");
			}
		}
		
	}
	else {
		System.out.println("The number is out of range");
	}
}
}

import java.util.Scanner;

public class Task22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number from 1 to 999");
	int n = sc.nextInt();
	
	if(n>= 1 && n<=999){
		
		int next = 1;
		int count =0;
		int num = 0;
		
		while (count < 10){
			if((next%2==0 || next%3==0 || next%5==0) && next>n){
				num++;
				System.out.print(num + ":" + next + ", ");
				count++;
			}
			
			next++;
		}
		
	}
	else{
		System.out.println("The number is out of range");
	}
}
}

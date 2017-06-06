import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number from 10 to 99:");
		int num = sc.nextInt();
		
		if(num>= 10 && num<=99){
			
			while(num > 2) {
				if (num % 2 == 0) {
					num = (int) (0.5 * num);
					System.out.print(num + " ");
				}
				if (num % 2 != 0) {
					num = (3 * num) + 1;
					System.out.print(num + " ");
				}
				if(num <=2){
					System.out.println("1");
				}
			} 			

		} else {
			System.out.println("The number is not between 10 and 99");
		}
	}
}

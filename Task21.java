import java.util.Scanner;

public class Task21 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number from 1 to 52:");
	int a = sc.nextInt();
	
	for (int card = a; card <=52; card++) {
		int cardNum = (card-1)/4+1;
		int color = card%4;
		
		switch(cardNum){
		case 1: System.out.print("2"); break;
		case 2: System.out.print("3"); break;
		case 3: System.out.print("4"); break;
		case 4: System.out.print("5"); break;
		case 5: System.out.print("6"); break;
		case 6: System.out.print("7"); break;
		case 7: System.out.print("8"); break;
		case 8: System.out.print("9"); break;
		case 9: System.out.print("10"); break;
		case 10: System.out.print("Вале"); break;
		case 11: System.out.print("Дама"); break;
		case 12: System.out.print("Поп"); break;
		case 13: System.out.print("Асо"); break;		
		}
		System.out.print(" ");
		
		switch(color){
		case 1: System.out.print("спатия"); break;
		case 2: System.out.print("каро");break;
		case 3: System.out.print("купа");break;
		case 0: System.out.print("пика");break;
		}
		
		if(card<52){
			System.out.print(", ");
		}
	}
}
}

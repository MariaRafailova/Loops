
public class Task20 {
	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		for (int i = 0; i <= 9; i++) {
			num = i;
			sum = 0;
			do {
				System.out.print(num);
				sum += num;
				num++;
				if (num > 9) {
					num = 0;
					if (i == 1) {
						System.out.print(num);
					}
				}
			} while (sum < 45);

			System.out.println();
		}
	}
}

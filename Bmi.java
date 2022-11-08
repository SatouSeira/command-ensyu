import java.util.Scanner;

public class Bmi{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		for(int a = 0;a < 2;a ++){
			System.out.print("入力:");
			int sinntyou = scanner.nextInt();
			System.out.print("入力:");
			int taizyuu = scanner.nextInt();
			Double BMI = taizyuu / Math.pow((double)sinntyou / 100, 2);
			System.out.println((Math.floor(BMI * 100)) / 100);
		}
		scanner.close();
	}
}
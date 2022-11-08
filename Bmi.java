import java.util.Scanner;

public class Bmi{
	public static void main(String[] args){
		int sinntyou,taizyuu;
		double BMI;
		Scanner scanner = new Scanner(System.in);
		for(int a = 0;a < 2;a ++){
			System.out.print("入力:");
			sinntyou = scanner.nextInt();
			System.out.print("入力:");
			taizyuu = scanner.nextInt();
			BMI = taizyuu / Math.pow((double)sinntyou / 100, 2);
			System.out.println((Math.floor(BMI * 100)) / 100);
		}
		scanner.close();
	}
}
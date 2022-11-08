import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int sinntyou,taizyuu;
		double keisannSinntyou,BMI;
		Scanner scanner = new Scanner(System.in);
		for(int a = 0;a < 2;a ++){
			System.out.print("入力:");
			sinntyou = scanner.nextInt();
			keisannSinntyou = (double)sinntyou / 100;
			System.out.print("入力:");
			taizyuu = scanner.nextInt();
			BMI = taizyuu / (keisannSinntyou * keisannSinntyou);
			BMI *= 100;
			BMI = (int)BMI;
			BMI /= 100;
			System.out.println(BMI);
		}
		scanner.close();
	}
}
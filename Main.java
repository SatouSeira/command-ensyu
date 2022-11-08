import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		System.out.print("入力:");
		Scanner scanner = new Scanner(System.in);
		int sinntyou = scanner.nextInt();
		double keisannSinntyou = (double)sinntyou / 100;
		System.out.print("入力:");
		int taizyuu = scanner.nextInt();
		scanner.close();
		double BMI = taizyuu / (keisannSinntyou * keisannSinntyou);
		BMI *= 100;
		BMI = (int)BMI;
		BMI /= 100;
		System.out.println(BMI);
	}
}
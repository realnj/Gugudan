import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// ����� �Է�  	(���ڿ�)
		System.out.println("���ϴ� �ܼ� 2�� �Է�(ex. 5,8) : ");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		// ��� ���
		for (int i = 2; i < first+1; i++) {
			int[] result = Gugudan.calculate(i, second);
			Gugudan.print(result);
		}
	}
}
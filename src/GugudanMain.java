import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// 사용자 입력  	(문자열)
		System.out.println("원하는 단수 2개 입력(ex. 5,8) : ");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		// 결과 출력
		for (int i = 2; i < first+1; i++) {
			int[] result = Gugudan.calculate(i, second);
			Gugudan.print(result);
		}
	}
}
//import java.util.Scanner;

public class Gugudan {
	// 계산 method
    public static int[] calculate(int times, int max) {
        int[] result = new int[max];
        for (int i = 0; i < result.length; i++) {
        		result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 화면에 출력
        	System.out.println(result[i]);
        }
    }

//    
//	public static void main(String[] args) {
//		// method 
//		
//		for(int i = 2; i < 10; i++) {
//			int[] result = calculate(i);
//			print(result);
//		}
			
//		// 2중 for문
//		int[] result = new int[9];
//		for (int j = 2; j < 10; j++) {
//			System.out.println(j + "단 : ");
//			for (int i = 0; i < result.length; i++) {
//				// 계산결과 배열에 반영
//				result[i] = j * (i + 1);
//				System.out.println(result[i]);
//			}
//		}
		
		
//		int[] result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			// 계산결과 배열에 반영
//			result[i] = 2 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			// 계산결과 출력
//			System.out.println(result[i]);
//		}
//
//		result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			// 계산결과 배열에 반영
//			result[i] = 3 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			// 계산결과 출력
//			System.out.println(result[i]);
//		}
		
		//		// 8, 9단, 사용자 입력
//		System.out.println("구구단 출력할 값? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자 입력값: " + number);
//		
//		if (number < 2) {
//			System.out.println("(Error)입력값 미만");
//		} else if (number > 9) {
//			System.out.println("(Error)입력값 초과");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}	
//		}
//				
		
//		// 6단, while문
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i++;
//		}
//		// 7단, for문
//		
//		for(int j = 1; j <10; j++) {
//			System.out.println(7 * j);
//		}
//		
//				// 2단
//		System.out.println("2단:");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		// 3단
//		System.out.println("3단:");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
	
	
}


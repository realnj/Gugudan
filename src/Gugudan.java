//import java.util.Scanner;

public class Gugudan {
	// ��� method
    public static int[] calculate(int times, int max) {
        int[] result = new int[max];
        for (int i = 0; i < result.length; i++) {
        		result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // ��� ����� ȭ�鿡 ���
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
			
//		// 2�� for��
//		int[] result = new int[9];
//		for (int j = 2; j < 10; j++) {
//			System.out.println(j + "�� : ");
//			for (int i = 0; i < result.length; i++) {
//				// ����� �迭�� �ݿ�
//				result[i] = j * (i + 1);
//				System.out.println(result[i]);
//			}
//		}
		
		
//		int[] result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			// ����� �迭�� �ݿ�
//			result[i] = 2 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			// ����� ���
//			System.out.println(result[i]);
//		}
//
//		result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			// ����� �迭�� �ݿ�
//			result[i] = 3 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			// ����� ���
//			System.out.println(result[i]);
//		}
		
		//		// 8, 9��, ����� �Է�
//		System.out.println("������ ����� ��? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("����� �Է°�: " + number);
//		
//		if (number < 2) {
//			System.out.println("(Error)�Է°� �̸�");
//		} else if (number > 9) {
//			System.out.println("(Error)�Է°� �ʰ�");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}	
//		}
//				
		
//		// 6��, while��
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i++;
//		}
//		// 7��, for��
//		
//		for(int j = 1; j <10; j++) {
//			System.out.println(7 * j);
//		}
//		
//				// 2��
//		System.out.println("2��:");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		// 3��
//		System.out.println("3��:");
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


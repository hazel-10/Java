import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int time = scanner.nextInt();
		int second = time % 60; // 60으로 나눈 나머지는 초
		int minute = (time/60) % 60; // 60으로 나눈 몫을 60으로 다시 나눈 나머지는 분
		int hour = (time/60) / 60; // 60으로 나눈 몫을 60으로 다시 나누면 시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, " );
		System.out.print(second + "초입니다.");
		
		scanner.close();
		
	

	}

}

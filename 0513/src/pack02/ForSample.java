package pack02;

public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i <= 10; i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i);
			
			if(i <= 9)
				System.out.print(" + ");
			else {
				System.out.print(" = ");
				System.out.print(sum);
			}
				
	
		}
	}

}

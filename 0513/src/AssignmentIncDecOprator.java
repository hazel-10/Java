
public class AssignmentIncDecOprator {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		//대입연산자
		a += 3;
		b *= 3;
		c %= 2;
		
		System.out.println("a= "+ a + ", b= "+ b + ", c= " + c);
		
		int d=3;
		//증감 연산자
		System.out.println(a);
		a = d++; // a에 d(3) 대입 후 d++(4)
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // d++(5) 후 d값을 a에 대입
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // 
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);

	}

}

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");

		String word = sc.nextLine();
		System.out.println(word.charAt(0));
		
	}

	public static void q2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");

		boolean trueFalse = sc.nextBoolean();
		sc.nextLine();

		System.out.println(!trueFalse);
		
	}

	public static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");

		int num = sc.nextInt();
		sc.nextLine();

		System.out.println(num > 5);
		
	}

	public static void q4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");

		double num = sc.nextDouble();
		sc.nextLine();
		System.out.println((num>=-2)&&(num<=2));
	}

	public static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");

		String word = sc.nextLine();

		System.out.println(word.equals("Hello World"));
	
	}

	public static void q6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");
		
		int num = sc.nextInt();
		sc.nextLine();

		System.out.print("In: ");

		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println(num <= num2);

	}

	public static void q7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");
		
		double num = sc.nextDouble();
		sc.nextLine();

		System.out.print("In: ");
		
		double num2 = sc.nextDouble();
		sc.nextLine();

		System.out.println(num > num2);
		
	}

}

//Hi Mr.K I hate the test because why I cannot have my ln :<
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char a1;
		a1='a';
		System.out.println(a1);
		//Write question 1 code here
	}

	public static void q2() {
		Scanner scanner=new Scanner(System.in);
		char   b;
		System.out.print("Input a word: ");
		b=scanner.next().charAt(2);
		System.out.println(b);

		//Write question 2 code here
	}

	public static void q3() {
		Scanner scanner=new Scanner(System.in);
		String a;
		char b;
		System.out.print("Input a word: ");
		b=scanner.next().charAt(1);
		System.out.println("The second character user entered was: "+(b));


		//Write question 3 code here
	}

	public static void q4() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input a number:");
        int a=scanner.nextInt();
		System.out.println(" Your number plus 1 is: "+(a+1));
		//Write question 4 code here
	}

	public static void q5() {
		Scanner scanner=new Scanner(System.in);
	    System.out.print("Input a letter:");
		String a=scanner.nextLine();
        char a1=a.charAt(0);
		System.out.print(" Input another letter: ");
		String b=scanner.nextLine();
		char b2=b.charAt(0);
		System.out.println(a1+b2);


		//Write question 5 code here
	}

}

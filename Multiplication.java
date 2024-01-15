import java.util.Scanner;
public class Multiplication
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Multiplication Program");
		System.out.println("\n<<<Please enter a positive number from 1 to 10>>>");
		Scanner input=new Scanner(System.in);
		int positivenumber;
		System.out.print("\nEnter the number: ");
		positivenumber=input.nextInt();
		
		if (positivenumber > 0) {
		System.out.println("\n<<<You may now check the multiplication table for " + positivenumber + ">>>\n");
		for(int p= 1; p<=10; p++) {
		int product=positivenumber *p;
		System.out.println(positivenumber +" x "+p+" = " + product);
		}
		} else
		System.out.println("\n<<<You have entered a negative number therefore an error has occurred and will proceed to end the program>>>");
	}
}

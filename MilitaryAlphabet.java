import java.util.Scanner;
public class MilitaryAlphabet
{
	public static void main(String[] args) {
	do{
	Scanner input=new Scanner(System.in);
	System.out.println("\nMilitary Alphabet");
	System.out.print("Enter your letter: ");
	char letter=input.next().charAt(0);
	
	if(letter=='A'||letter=='a')
	{System.out.println("\nAlpha");}
	else if(letter=='B'||letter=='b')
	{System.out.println("\nBravo");}
	else if(letter=='C'||letter=='c')
	{System.out.println("\nCharlie");}
	else if(letter=='D'||letter=='d')
	{System.out.println("\nDelta");}
	else if(letter=='E'||letter=='e')
	{System.out.println("\nEcho");}
	else if(letter=='F'||letter=='f')
	{System.out.println("\nFoxtrot");}
	else if(letter=='G'||letter=='g')
	{System.out.println("\nGolf");}
	else if(letter=='H'||letter=='h')
	{System.out.println("\nHotel");}
	else if(letter=='I'||letter=='i')
	{System.out.println("\nIndia");}
	else if(letter=='J'||letter=='j')
	{System.out.println("\nJuliet");}
	else if(letter=='K'||letter=='k')
	{System.out.println("\nKilo");}
	else if(letter=='L'||letter=='l')
	{System.out.println("\nLima");}
	else if(letter=='M'||letter=='m')
	{System.out.println("\nMike");}
	else if(letter=='N'||letter=='n')
	{System.out.println("\nNovember");}
	else if(letter=='O'||letter=='o')
	{System.out.println("\nOscar");}
	else if(letter=='P'||letter=='p')
	{System.out.println("\nPapa");}
	else if(letter=='Q'||letter=='q')
	{System.out.println("\nQuebec");}
	else if(letter=='R'||letter=='r')
	{System.out.println("\nRomeo");}
	else if(letter=='S'||letter=='s')
	{System.out.println("\nSierra");}
	else if(letter=='T'||letter=='t')
	{System.out.println("\nTango");}
	else if(letter=='U'||letter=='u')
	{System.out.println("\nUniform");}
	else if(letter=='V'||letter=='v')
	{System.out.println("\nVictor");}
	else if(letter=='W'||letter=='w')
	{System.out.println("\nWhiskey");}
	else if(letter=='X'||letter=='x')
	{System.out.println("\nX-ray");}
	else if(letter=='Y'||letter=='y')
	{System.out.println("\nYankee");}
	else if(letter=='Z'||letter=='z')
	{System.out.println("\nZulu");}
	else
	{System.out.println("\nInvalid");}
	}while(true);
	}
}
Mon 10:00 PM
You sent
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	do{
	Scanner input=new Scanner(System.in);
	System.out.println("\nStudent Grade Computation");
	System.out.println("Written Works: ");
	double WW= input.nextDouble();
	System.out.println("Performance Tasks:");
	double PT= input.nextDouble();
	System.out.println("Quarterly Exam: ");
	double QE= input.nextDouble();
	
	double Finalgrade=0;
	Finalgrade=WW*0.2+PT*0.6+QE*0.2;
	System.out.println("Your Final Grade is: " +Finalgrade);
	
	if(Finalgrade>=98 && Finalgrade<=100)
	{System.out.println("\nWith Highest Honors");}
	else if(Finalgrade>=98 && Finalgrade<=100)
	{System.out.println("\nWith High Honors");}
	else if(Finalgrade>=98 && Finalgrade<=100)
	{System.out.println("\nWith Honors");}
	else
	{System.out.println("\not applicable as ");}
	}while(true);
	}
}

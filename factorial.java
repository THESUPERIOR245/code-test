import java.util.Scanner;
public class factorial
{
  public static void main (String[]args)
  {
      
    System.out.println ("Welcome to the Factorial Calculator Program");
    System.out.println ("\n<<<Please enter a positive number>>>");
    Scanner input = new Scanner(System.in);
    int positivenumber;
    System.out.print("\nEnter the number: ");
    positivenumber = input.nextInt();
    
    
    if (positivenumber>0)
      {
    float i,factorial=1;
    for(i=1;i<=positivenumber;i++){    
    factorial=factorial*i;} 
    System.out.println("\nThe factorial of "+positivenumber+" is: "+factorial);
      }
    else
    {
    System.out.println ("\n<<<You have entered a negative number therefore an error has occurred>>>");
	}
	
	input.close();
   } 
}

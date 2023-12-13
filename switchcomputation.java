import java.util.Scanner;
public class Gaswitchcomputation
{
	public static void main(String[] args) {
		System.out.println("Student Grade Computation program");
		
		Scanner input=new Scanner(System.in);
		String studentNumber=null;
		String studentName=null;
		String courseandsection=null;
		String Subject=null;
		String Professor=null;
		int Prelims,Midterms,Prefinals,Finals;
		int Finalgrade;
		
		System.out.println("\nStudent Information");
		System.out.println("Enter student Number: ");
		studentNumber=input.nextLine();
		System.out.println("Enter student Name: ");
		studentName=input.nextLine();
		System.out.println("Enter course and section: ");
		courseandsection=input.nextLine();
		System.out.println("Enter Subject: ");
		Subject=input.nextLine();
		System.out.println("Enter Professor: ");
		Professor=input.nextLine();
		System.out.println("\nGrade Distribution");
		System.out.println("Prelims: ");
		Prelims=input.nextInt();
		System.out.println("Midterms: ");
		Midterms=input.nextInt();
		System.out.println("Prefinals:  ");
		Prefinals=input.nextInt();
		System.out.println("Finals: ");
		Finals=input.nextInt();
		
	
	  Finalgrade = (Prelims+Midterms+Prefinals+Finals)/4;
	  System.out.println("\nFinalgrade: " + Finalgrade);  
	    
	switch(Finalgrade/5){
	    case 20:
	    case 19:
	    case 18:
	    case 17:
	    case 16:
	    case 15:
	      System.out.println("Remarks: Passed");break;
	      
	      default:
	      System.out.println("Remarks: Failed");
	}
	}
	}	
		
	

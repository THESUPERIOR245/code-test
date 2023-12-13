import java.util.Scanner;
public class Gaifcomputation
{
	public static void main(String[] args) {
		System.out.println("Student Grade Computation program");
		
		Scanner input=new Scanner(System.in);
		String studentNumber=null;
		String studentName=null;
		String courseandsection=null;
		String Subject=null;
		String Professor=null;
		double Prelims,Midterms,Prefinals,Finals,Finalgrade;
		
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
		Prelims=input.nextDouble();
		System.out.println("Midterms: ");
		Midterms=input.nextDouble();
		System.out.println("Prefinals:  ");
		Prefinals=input.nextDouble();
		System.out.println("Finals: ");
		Finals=input.nextDouble();
		
		Finalgrade = (Prelims+Midterms+Prefinals+Finals)/4;
	    System.out.println("\nFinalgrade: " + Finalgrade);
		
	if(Finalgrade>=75){
	System.out.println("Remarks: Passed");
	}else{
	System.out.println("Remarks: Failed ");
	}
}
}

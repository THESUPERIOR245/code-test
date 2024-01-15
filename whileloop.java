import java.util.Scanner;
import java.text.DecimalFormat;
public class whileloop
{
	public static void main(String[] args) {
    	System.out.println("Welcome to the Temperature Measurement Program");		
	System.out.println("\n<<<Please enter the number of temperature measurements you want to take>>>");
	Scanner input=new Scanner(System.in);
	DecimalFormat format=new DecimalFormat("##.00");
	int NumOfMeasure;
	System.out.print("\nNumber of temperature measurements: ");
	NumOfMeasure=input.nextInt();
	
	double TotalTemperature = 0;
	int CountOfMeasure = 0;
	
	while(CountOfMeasure<NumOfMeasure) {
	System.out.print("Enter temperature measurement " + (CountOfMeasure + 1) + ": "); 
	double temperature=input.nextDouble();
	TotalTemperature += temperature;
	CountOfMeasure++;
	}
	
	double AverageTemperature = TotalTemperature / NumOfMeasure;
	
	System.out.println("\n<<<You may now check the temperature results>>>");
    	System.out.println("\nNumber of measurements: " + NumOfMeasure);
    	System.out.println("Total sum of temperature: " + TotalTemperature);
    	System.out.println("Average temperature: " + format.format(AverageTemperature));
    
}
}

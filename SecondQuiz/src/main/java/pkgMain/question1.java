package pkgMain;
import java.text.DecimalFormat;
import java.util.Scanner;

public class question1 {

public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("What's the annual tuition?");
	double tuition = s.nextDouble();
	
	System.out.println("How many years are you studying?");
	double years = s.nextDouble();
	
	System.out.println("What's the annual percentage interest increase rate?");
	double interest = s.nextDouble();
	
    double totalAmount = 0;
    
    for (int i = 0; i <= (years-1); i++ ){
    	double increasetuition = tuition * Math.pow( (1+interest/100), i);
        totalAmount += increasetuition;
        
    }
        
    DecimalFormat money = new DecimalFormat("0.00");
	System.out.println("This is your total tuition: $ " + money.format(totalAmount));
	s.close();
}

}

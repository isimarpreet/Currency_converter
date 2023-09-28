package currency;
import java.util.*;
import java.text.DecimalFormat;
public class currency_converter {
	    public static void main(String[] args)
	    {
	        double amount;
	        double rupee, dollar, pound, euro, yen;
	        int choice;

	        DecimalFormat f = new DecimalFormat("##.##");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Following are the Choices:");
	        System.out.println("Enter 1: Ruppe");
	        System.out.println("Enter 2: Dollar");
	        System.out.println("Enter 3: Pound");
	        System.out.println("Enter 4: Euro");
	        System.out.println("Enter 5: Yen");

	        System.out.print("\nChoose from above options: ");
	        choice = sc.nextInt();

	        System.out.println("Enter the amount you want to convert:");
	        amount = sc.nextFloat();

	        switch (choice)
	        {
	            case 1:  // Ruppe Conversion
	                dollar = amount / 83.22;
	                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

	                pound = amount / 104.08;
	                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

	                euro = amount / 89.26;
	                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");

	                yen = amount / 0.56;
	                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

	                break;

	            case 2:  // Dollar Conversion
	                rupee = amount * 83.22;
	                System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");

	                pound = amount *0.80;
	                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

	                euro = amount *0.93;
	                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

	                yen = amount *147.66;
	                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

	                break;

	            case 3:  // Pound Conversion
	                rupee = amount * 104.08;
	                System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");

	                dollar = amount *1.25;
	                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

	                euro = amount *1.17;
	                System.out.println(amount + " pound = " + f.format(euro) + " Euro");

	                yen = amount *184.68;
	                System.out.println(amount + " pound = " + f.format(yen) + " Yen");

	                break;

	            case 4:  // Euro Conversion
	                rupee = amount * 89.25;
	                System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");

	                dollar = amount *1.07;
	                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

	                pound = amount *0.86;
	                System.out.println(amount + " euro = " + f.format(pound) + " Pound");

	                yen = amount *158.37;
	                System.out.println(amount + " euro = " + f.format(yen) + " Yen");

	                break;

	            case 5:  // Yen Conversion
	                rupee = amount *0.56;
	                System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");

	                dollar = amount *0.0068;
	                System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

	                pound = amount *0.0054;
	                System.out.println(amount + " yen = " + f.format(pound) + " Pound");

	                euro = amount *0.0063;
	                System.out.println(amount + " yen = " + f.format(euro) + " Euro");

	                break;


	            //Default case
	            default:
	                System.out.println("Invalid Input .Kindly choose from above given options for conversion");
	        }
	    }
	}



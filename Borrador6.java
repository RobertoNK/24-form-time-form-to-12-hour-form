import java.util.Scanner;

public class Borrador6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 24-hour time: ");
		String number = input.nextLine().trim();
		String hour = number.substring(0, number.indexOf(":"));
		String min = number.substring(number.indexOf(":")+1);
		int hourInteger = Integer.parseInt(hour);
		//System.out.println(hourInteger);
		int hour_1=Integer.parseInt(hour);
		if(hourInteger>12 && hourInteger<24) {
			hourInteger=hourInteger-12;
			
		}else if(hourInteger==24){
			hourInteger=0;
		}else if (hourInteger<0||hourInteger>24 ){
			System.out.println("Invalid time entered");
		}
		if(hour_1>12) {
			System.out.println("Equivalent 12-hour time : "+hourInteger+":"+min+"PM");
		}else {
		System.out.println("Equivalent 12-hour time : "+hourInteger+":"+min+"AM");
	}
	}
}

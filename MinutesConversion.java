
import java.util.Scanner;

public class MinutesConversion {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the number of minutes: ");
int minutes = input.nextInt();

double hours = minutes/60;

double days = hours/24;

System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");

    }
}
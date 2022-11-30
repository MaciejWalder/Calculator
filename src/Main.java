import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number below:");
        double number1=scanner.nextDouble();
        System.out.println("Please enter next number below: ");
        double number2=scanner.nextDouble();
        Calculator calculator1=new Calculator(number1+number2, number1-number2, number1*number2,number1/number2);
        System.out.println("Addition result: "+calculator1.getAddition());
        System.out.println("Subtraction result: "+calculator1.getSubtraction());
        System.out.println("Multiplication result: "+calculator1.getMulitplication());
        System.out.println("Division result: "+calculator1.getDivision());






    }

}

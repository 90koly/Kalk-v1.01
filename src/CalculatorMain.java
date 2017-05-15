import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner calc = new Scanner(System.in);

        // Enter the first integer (Integer 1)
        System.out.println("Enter the first number: ");
        double integer1 = int1.nextDouble();

        // Enter the second integer (Integer 2)
        System.out.println("Enter the second number: ");
        double integer2 = int2.nextDouble();

        // Enter if you wanna add or divide
        System.out.println("Enter the Calculation type: ");
        System.out.println(" ");
        System.out.println("Case Sensitive!");
        System.out.println(" ");
        System.out.println("If you wanna add type: add ");
        System.out.println("If you wanna subtract type: minus OR subtract ");
        System.out.println("If you wanna times / multiply type: times OR multiply ");
        System.out.println("If you wanna divide type: divide ");
        System.out.println(" ");
        System.out.print("Calculation Type: ");
        String typeofcalc = calc.nextLine();
        System.out.println(" ");


        // Calculations Variable
        double addcalc = integer2 + integer1;
        double minuscalc = integer2 - integer1;
        double times = integer2 * integer1;
        double divide = integer2 / integer1;


        switch(typeofcalc){
            case("add"):
                System.out.println("Your answer is: " + addcalc);
                break;

            case("minus"):
                System.out.println("Your answer is: " + minuscalc);
                break;

            case("subtract"):
                System.out.println("Your answer is: " + minuscalc);
                break;

            case("times"):
                System.out.println("Your answer is: " + times);
                break;

            case("multiply"):
                System.out.println("Your answer is: " + times);
                break;

            case("divide"):
                System.out.println("Your answer is: " + divide);
                break;

            default:
                System.out.println("Type of calculation not recognized! Restart Program!");
        }



    }
}

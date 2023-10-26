import java.util.Scanner;

public class Report {
    private String firstName;
    private String reportName;

    Scanner keyboard = new Scanner(System.in);

    public String getReportName(){
        //Input report name
        reportName = keyboard.nextLine().replaceAll("[^a-zA-Z]","");
        return reportName;
    }
    public String getFirstName() {
        //Input first name as a string
        firstName = keyboard.nextLine().replaceAll("[^a-zA-Z]","");
        return firstName;
    }
    public String getLastName() {
        String lastName = "";
        String input;
        while (true) {
            input = keyboard.nextLine();
            if (input.equals("-1")) {
                break;
            }
            lastName += input.replaceAll("[^a-zA-Z]", "");
        }
        return lastName;
    }
}

class Number {
    private final double[] numericInputs;
    private int inputCount;

    /*There are 2 ways to finish numeric inputs:
      1)maxInputs limit reached
      2)user inputs -1 */
    public Number (int maxInputs) {
        this.numericInputs = new double[maxInputs];
        this.inputCount = 0;
    }

    public boolean reachLimits(double input) {
        if (inputCount < numericInputs.length) {
            numericInputs[inputCount] = input;
            inputCount++;
            return false;
        } else {
            System.out.println("Max input limit reached.");
            return true;
        }
    }

    public void displayInputs() {
        System.out.println("------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Input Number", "Highest Number", "Lowest Number", "Total", "Average");
        System.out.println("------------------------------------------");
        double total=0.0, avg=0.0, lowest=Double.MAX_VALUE, highest=Double.MIN_VALUE;
        for (int i=0; i<inputCount; i++) {
            double input = numericInputs[i];
            total += input;
            avg = total / (i + 1);
            lowest = Math.min(lowest, input);
            highest = Math.max(highest, input);
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", input, highest, lowest, total, avg);
        }
        System.out.println("------------------------------------------");
        System.out.println("Grand Total: " + total);
    }
}



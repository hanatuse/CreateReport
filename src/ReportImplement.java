import java.util.Scanner;

public class ReportImplement {
    public static void main(String[] args) {
        Report report = new Report();
        System.out.println("Enter the report name:");
        String reportName = report.getReportName();
        System.out.println("Enter the report owner's first name:");
        String firstName = report.getFirstName();
        System.out.println("Enter the report owner's last name, type -1 to finish:");
        String lastName = report.getLastName();

        System.out.println("---------------Final Report---------------");
        System.out.println("Report Name: " + reportName);
        System.out.println("Report Owner's Full Name: " + firstName + lastName);
        System.out.println("Enter the numeric inputs, type -1 to finish:");
        Number number = new Number(7);
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            try {
                double parsedInput = Double.parseDouble(input);
                boolean reachLimit = number.reachLimits(parsedInput);
                if (reachLimit) break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid numeric input. Please try again.");
            }
            number.displayInputs();
        }
        scanner.close();
    }
}

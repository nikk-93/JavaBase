import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter operation (+, -, *, /, undo) and value (e.g. '+ 5') or 'exit':");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] tokens = input.split(" ");
            String operation = tokens[0];
            double value = 0;

            if (!operation.equalsIgnoreCase("undo")) {
                try {
                    value = Double.parseDouble(tokens[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid value");
                    continue;
                }
            }

            switch (operation) {
                case "+":
                    calculator.add(value);
                    break;
                case "-":
                    calculator.subtract(value);
                    break;
                case "*":
                    calculator.multiply(value);
                    break;
                case "/":
                    calculator.divide(value);
                    break;
                case "undo":
                    calculator.undo();
                    break;
                default:
                    System.out.println("Error: Invalid operation");
                    continue;
            }

            System.out.println("Current result: " + calculator.getResult());
        }

        scanner.close();
    }
}
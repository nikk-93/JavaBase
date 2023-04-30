import java.util.Stack;

public class Calculator {
    private double result;
    private Stack<Double> history;

    public Calculator() {
        result = 0;
        history = new Stack<>();
    }

    public void add(double value) {
        saveState();
        result += value;
    }

    public void subtract(double value) {
        saveState();
        result -= value;
    }

    public void multiply(double value) {
        saveState();
        result *= value;
    }

    public void divide(double value) {
        if (value == 0) {
            System.out.println("Error: Division by zero");
            return;
        }
        saveState();
        result /= value;
    }

    public void undo() {
        if (!history.isEmpty()) {
            result = history.pop();
        } else {
            System.out.println("Error: No operations to undo");
        }
    }

    private void saveState() {
        history.push(result);
    }

    public double getResult() {
        return result;
    }
}
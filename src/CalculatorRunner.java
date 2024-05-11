public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calcInstance = new Calculator();
        calcInstance.startEngine(50,80);
        calcInstance.stopEngine(50,50);
    }
}

public class Calculator {

    void startEngine(int firstValue, int secondValue){
        System.out.println("The car's engine has started");
        int sum = firstValue + secondValue;
        System.out.println("Engine is on: " + sum);
    }
    void stopEngine(int firstValue, int secondValue){
        System.out.println("The car's engine has stopped");
        int result = firstValue - secondValue;
        System.out.println("Engine is off: " + result);
    }
}

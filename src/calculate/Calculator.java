package calculate;

/**
 * This class is to support the Main method in calculator package.
 */
public class Calculator {
// Instance methods for addition, Subtraction, Multiplication and Division calculation
    public void addition(int a, int b){
                System.out.println("Addition of " + a + " and " + b + " is : " +(a+b));   }
    public void subtraction(int a, int b){
        System.out.println("Subtraction of " + a + " and " + b + " is : " +(a-b));
    }
    public void division(int a, int b){
        System.out.println( a + " is Divided by " + b + " is : " +(a/b));
    }
    public void multiplication(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is : " +(a*b));
    }

    // Symbol input for method selection
    public void calculateResult(int a, int b, char symbol){

        switch (symbol) {
            case '+':
               addition(a,b);
                break;
            case '-':
                subtraction(a,b);
                break;
            case '*':
                multiplication(a,b);
                break;
            case '/':
                division(a,b);
                break;
            default:
                System.out.println(" Invalid symbol, Please Enter valid symbol ( + , - , * , /  ");
        }
    }
}

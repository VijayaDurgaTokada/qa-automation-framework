public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public double divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a/b;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("2 + 3= " + calculator.add(2,3));
        System.out.println("5-3 = " + calculator.subtract(5,3));
        System.out.println("10*3 = " + calculator.multiplication(10, 3));
        System.out.println("10/ 4= "+calculator.divide(10, 4));
        try {
    calculator.divide(5, 0);
        } catch (IllegalArgumentException e) {
    System.out.println("Error caught: " + e.getMessage());
         }
             }
} 

public class Calculator {
    private int total;

    public Calculator (){
        this.total = 0;
    }

    public int getTotal(){
        return this.total;
    }

    public int add(int num1, int num2) {
        this.total = num1 + num2;
        return this.total;
    }

    public int subtract(int num1, int num2) {
        this.total = num1 - num2;
        return this.total;
    }

    public int multiply(int num1, int num2) {
        this.total = num1 * num2;
        return this.total;
    }

    public int divide(int num1, int num2) {
        this.total = num1 / num2;
        return this.total;
    }
}

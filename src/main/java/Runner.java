public class Runner {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(100, 100));
        WaterBottle waterBottle = new WaterBottle(500, 500);
        System.out.println(waterBottle.drinkWater());
        System.out.println(waterBottle.emptyBottle());
        System.out.println(waterBottle.fillBottle());
    }
}
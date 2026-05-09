

public class DeliveryChargeTest {
    public static void main(String[] args) {


        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(500.0);
        System.out.println("Base charge only: Rs. " + charge1);

        double charge2 = calculator.calculateCharge(500.0, 3.0);
        System.out.println("Base + Distance (3 km): Rs. " + charge2);

        double charge3 = calculator.calculateCharge(500.0, 3.0, 2.0);
        System.out.println("Base + Distance (3 km) + Weight (2 kg): Rs. " + charge3);

        double charge4 = calculator.calculateCharge(500.0, true);
        System.out.println("Base + Express Delivery: Rs. " + charge4);

        double charge5 = calculator.calculateCharge(500.0, false);
        System.out.println("Base + No Express Delivery: Rs. " + charge5);
    }
}
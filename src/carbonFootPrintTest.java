public class carbonFootPrintTest {
    public static void main(String[] args) {
        carbonFootPrint[] carbon = new carbonFootPrint[3];

        carbon[0] = new Car(1000, 20.0);
        carbon[1] = new Building(15500, 20200, 700);
        carbon[2] = new Bicycle(1100);

        for (carbonFootPrint Counter : carbon) {
            System.out.println(Counter);
        }
    }
}

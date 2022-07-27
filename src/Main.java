public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myCalculate = service.calculate( 1.62, 45);

        System.out.println(myCalculate);
    }
}
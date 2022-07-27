public class BmiService {
    public int calculate(double height, int weight) {
        int bodyMassIndex = (int) (weight / 2* height);
        return bodyMassIndex;
    }
}
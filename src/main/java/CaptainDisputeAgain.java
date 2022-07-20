import static java.lang.Math.min;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int minValue = min(triple[0], triple[1]);
        return min(minValue, triple[2]);
    }
}

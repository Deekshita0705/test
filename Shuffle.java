import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        Collections.shuffle(values);
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
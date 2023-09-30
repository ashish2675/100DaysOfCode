import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class naturalSort {
    public static void main(String... args)
    {

        List<Integer> values
                = Arrays.asList(212, 324, 435, 566, 133, 100, 121);

        values.sort(Comparator.naturalOrder());

        System.out.println(values);
    }
}
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        List<Integer> numbers1 = new ArrayList<>(numbers);
        List<Integer> numbers2 = new ArrayList<>(numbers);
        List<Integer> numbers3 = new ArrayList<>(numbers);
        List<Integer> numbers4 = new ArrayList<>(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        numbers1.sort(null);
        System.out.println(numbers1);

        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);
        // sorting using comparator interface
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        numbers2.sort(comp);
        System.out.println(numbers2);

        class MyComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        MyComparator myComp = new MyComparator();
        numbers3.sort(myComp);
        System.out.println(numbers3);
        
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class IntList {
    public static void main(String[] args) {
        // a list of integers
        List<Integer> intList = new ArrayList<>();

        // add elements
        intList.add(5);
        intList.add(-3);
        intList.add(10);

        // print the list using toString method
        System.out.println(intList.toString());

        // print the list using for loop
        for(int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }

        // print the list using enhanced for loop
        System.out.println("");
        for(Integer num : intList) {
            System.out.print(num + " ");
        }
        System.out.println("");

        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class ShoppingList {
    public static void main(String[] args){
        List<String> shoppingList = new ArrayList<>();

        // populate the list
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");

        System.out.println(shoppingList.toString());
        
        // Print the elements using for statement
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        System.out.println("");
        
        // Print the elements using enhanced for statement
        for (String s : shoppingList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        
        // Print the elements using iterator
        Iterator<String> iter = shoppingList.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("");

        shoppingList.remove("bread");
        System.out.println(shoppingList);

        String el = shoppingList.remove(2);
        System.out.println(shoppingList);
        System.out.println(el);

        List<String> newShoppingList = new ArrayList<>(shoppingList);
        System.out.println(newShoppingList);

        newShoppingList.add("apple");
        newShoppingList.add("kiwi");

        System.out.println(newShoppingList);

        // check if the new list contains element "tea"
        if (newShoppingList.contains("tea")) {
            System.out.println("tea is in the list");
        } else {
            System.out.println("tea is not in the list");
        }

        // create a new linked list

        LinkedList<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        System.out.println(newLinkedList);
        
        newLinkedList.addAll(newShoppingList);
        System.out.println(newLinkedList);

        newLinkedList.removeFirst();
        System.out.println(newLinkedList);
        
        newLinkedList.removeLast();
        System.out.println(newLinkedList);

    }
}

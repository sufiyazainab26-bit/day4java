import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        //Creating a LinkedList
        LinkedList<String> names = new LinkedList<>();
        //Adding elements
        names.add("Jhon");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        //Displaying the list
        System.out.println("ArrayList:"+names);
        //Accessing an element
        System.out.println("First Element:"+names.get(0));
        //Updating an element
        names.set(1,"Peter");
        //Removing an element
        names.remove("David");
        //Size of ArrayList
        System.out.println("Size:"+names.size());
        //Adding element at First position
        names.addFirst("Sam");
        //Adding element at Last position
        names.addLast("Tom");
        //Size of LinkedList
        System.out.println("Size:"+names.size());

    }
    
}

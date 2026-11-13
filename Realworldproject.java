import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Realworldproject {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> books = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> issued =  new LinkedHashMap<>();
        ArrayList<String> history = new ArrayList<>();
        books.put(101,"Java");
        books.put(102,"Python");
        books.put(103,"C Programming");
        books.put(104,"C++");
        books.put(105,"HTML");
        books.put(106,"CSS");
        books.put(107,"JavaScript");
        books.put(108,"SQL");
        books.put(109,"DBMS");
        books.put(110,"Operating System");
        System.out.println("Available Boks:"+books);
        int id = 101;
        String student ="Zoya";
        if (books.containsKey(id)){
            String name = books.remove(id);
            issued.put(id, student);
            history.add(name+"issued to"+student);
            System.out.println(name+"issued successfully");}
            else{
                System.out.println("Book not available");
            }
            int returnId=101;
            if (issued.containsKey(returnId)) {
                issued.remove(returnId);
                books.put(returnId,"java");
                history.add("Java returned");
                System.out.println("Book returned successfully");
                System.out.println("Available Books:"+books);
                System.out.println("Issued History:"+history);
            
            
            
            
            
            
            }
        }
    }
    


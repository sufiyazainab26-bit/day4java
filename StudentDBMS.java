import java.util.HashMap;

public class StudentDBMS {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101,"Zoya");
        students.put(102,"Teja");
        students.put(103,"hindu");
        students.put(104,"Nagu");
        students.put(105,"Mad");
        System.out.println("Student Records:"+students);
        System.out.println("Student 102:"+students.get(102));
        students.put(103,"Shabana");
        students.remove(105);
        System.out.println("ID 101 Exists:"+students.containsKey("101"));
        System.out.println("Zoya Exists:"+students.containsValue("Zoya"));
        System.out.println("Student IDs:"+students.keySet());
        System.out.println("Student Name:"+students.values());
    }
    
}

import java.util.HashSet;

public class Idemptask {
    public static void main(String[] args) {
        HashSet<Integer>emp = new HashSet<>();
        //Storem 10 employee IDs
        emp.add(101);
        emp.add(102);
        emp.add(103);
        emp.add(104);
        emp.add(105);
        emp.add(106);
        emp.add(107);
        emp.add(108);
        emp.add(109);
        emp.add(110);
        //Add duplicate elements
        emp.add(105);
        //Display all IDs
        System.out.println("Employee IDs:"+emp);
        //Check IDs 
        System.out.println("105 Exists:"+emp.contains(105));
        //Remove IDs
        emp.remove(103);
        System.out.println("After Removing 103;"+emp);
        //Total employees
        System.out.println("Total Employees:"+emp.size());
        //Checking empty or not
        System.out.println("Is Empty:"+emp.isEmpty());

    }
    
}

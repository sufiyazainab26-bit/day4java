import java.util.LinkedList;
import java.util.Scanner;

public class Musictask {
    public static void main(String[] args) {
        LinkedList<String>songs = new LinkedList<>();
        //Store 5 songs
        songs.add("Arabic kuthu");
        songs.add("Tum hi ho");
        songs.add("Kesariya");
        songs.add("Vaseegara");
        songs.add("Heeriye");
        //Display all songs
        System.out.println("All songs:"+songs);
        //Add song at beginning
        songs.addFirst("Samajavaragamana");
        //Add song at end
        songs.addLast("Apna Bana le");
        Scanner sc = new Scanner(System.in);
        //Remove song by name
        System.out.println("Enter song to remove:");
        String name = sc.nextLine();
        songs.remove(name);
        //Display first and last song
        System.out.println("First song:"+songs.getFirst());
        System.out.println("Last song:"+songs.getLast());
        //Display all songs
        System.out.println("Updated playlist:"+songs);
        //Total number of songs
        System.out.println("Total Songs:"+songs.size());
    }
    
}

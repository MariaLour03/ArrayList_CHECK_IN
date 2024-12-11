
import java.util.ArrayList;
import java.util.Collections;

public class CheckIn_arrayList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(); // ArrayList to store student's name
        students.add("John");
        students.add("Mike");
        students.add("Smith");
        students.add("Jimmy");
        students.add("Bob");
        System.out.println("Original Student list: " + students);

        // Remove student
        students.remove(3);
        System.out.println("\nAfter removing student from index 3: " + students);

        // Sorting the student list
        Collections.sort(students);
        System.out.println("\nSorted Student list: " + students);

    }

}

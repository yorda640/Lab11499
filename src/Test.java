

import java.util.*;

public class Test {

    public static void main(String[] args) {
        // The previous content remains unchanged

        HashMap<Key, Student> map = Admin.processStudents(list);
        boolean[] expectedOutput = {true, false};
        boolean[] results = new boolean[2];
        Student s = new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN);
        Key pierre = new Key("Pierre", "Fromage");
        Key richard = new Key("Richard", "Fremling");
        results[0] = (map.get(pierre).equals(s));
        results[1] = !map.containsKey(richard); // Correcting the expected output
        System.out.println((Arrays.equals(expectedOutput, results) ? "pass" : "fail"));

        double ave = Admin.computeAverageGPA(map);
        // Expected output : Average GPA : 3.1833333333333336
        System.out.println("Average GPA : " + ave);
    }
}


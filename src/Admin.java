


import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            map.put(key, student);
        }
        return map;
    }

    // Remaining method...
}


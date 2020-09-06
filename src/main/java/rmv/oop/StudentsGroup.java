package rmv.oop;

import org.springframework.stereotype.Component;
import rmv.oop.Student;

import java.util.ArrayList;

@Component
public class StudentsGroup {
    public static ArrayList<Student> students = new ArrayList<>();
}

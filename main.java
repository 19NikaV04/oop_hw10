package Урок_10;

import java.util.ArrayList;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("1");
        List<Student> students = new ArrayList<>();
        students.add(new Student("2"));
        students.add(new Student("3"));

        Controller controller = new Controller();
        StudentGroup studentGroup = controller.creationStudentGroup(teacher, students);

        ConclusionStudentGroup conclusionStudentGroup = new ConclusionStudentGroup();
        conclusionStudentGroup.conclusion(studentGroup);
    }
}

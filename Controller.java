package Урок_10;

import java.util.List;

import Урок_8.Teacher;

public class Controller {
    
    public StudentGroup creationStudentGroup(Teacher teacher, List<Student> students) {
        StudentGroupService studentGroupService = new StudentGroupService();
        StudentGroup studentGroup = studentGroupService.formattingStudentGroup(teacher, students);
        return studentGroup;
    }

    public class creationStudentGroup {
    }

    public StudentGroup creationStudentGroup(Урок_10.Teacher teacher, List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creationStudentGroup'");
    }
}

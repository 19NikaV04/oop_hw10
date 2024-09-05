package Урок_10;

import java.util.List;

import Урок_8.Teacher;

public class StudentGroupService {
    
    public StudentGroup formattingStudentGroup(Урок_10.Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(teacher, students);
        return studentGroup;
    }

    public StudentGroup formattingStudentGroup(Teacher teacher, List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formattingStudentGroup'");
    }
}

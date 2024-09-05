package Урок_10;

import java.util.List;

import Урок_8.Teacher;

public class StudentGroup {
    
    private Teacher teacher;

    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public StudentGroup(Урок_10.Teacher teacher2, List<Student> students2) {
        //TODO Auto-generated constructor stub
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}

package Урок_10;

public class ConclusionStudentGroup {
    
    public void conclusion(StudentGroup studentGroup) {
        System.out.println("Teacher: " + studentGroup.getTeacher().getId());
        System.out.println("Students: ");
        for (Student Student: studentGroup.getStudents()) {
            System.out.println(Student.getId());
        }
    }
}

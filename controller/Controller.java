package controller;

import StudentGroup;
import StudentGroupSevice;
import data.Student;
import data.StudentGroup;
import service.DataService;
import service.StudentServiceImpl;
public class Controller {
    private DataService studentService;
    public Controller(StudentServiceImpl studentService) {

        this.studentService = studentService;
    }
    public Student createStudent(Student student){
        studentService.create(student);
        return (Student) studentService.read(student);
    }
    public createGroup(int groupNumber){
        StudentGroupSevice.create(StudentGroup);
        return StudentGroup;
    }

}

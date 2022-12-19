package service;

import Util.ReaderFromTxt;
import data.Student;
import data.Teacher;

public class StudentGroupServiceImpl implements DataService{
    @Override
    public Student read(Student user) {

        return (Student) ReaderFromTxt.read(user);
    }
    @Override
    public Teacher read(Teacher user) {

        return (Teacher) ReaderFromTxt.read(user);
    }
}



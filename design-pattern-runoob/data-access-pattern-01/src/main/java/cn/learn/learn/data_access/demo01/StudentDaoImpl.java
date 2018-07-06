package cn.learn.learn.data_access.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.data_access.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl(){
        students = new ArrayList<>();
        students.add(new Student("lisi",0));
        students.add(new Student("wangwu",1));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
    }

    @Override
    public void addStudent(Student student) {

    }
}

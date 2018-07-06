package cn.learn.learn.data_access.demo01;

import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.data_access.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);

    void addStudent(Student student);

}

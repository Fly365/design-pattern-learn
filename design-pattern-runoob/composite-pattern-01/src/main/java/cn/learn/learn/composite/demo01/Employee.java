package cn.learn.learn.composite.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.composite.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;


    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

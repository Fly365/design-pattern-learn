package cn.learn.learn.data_access.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.data_access.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

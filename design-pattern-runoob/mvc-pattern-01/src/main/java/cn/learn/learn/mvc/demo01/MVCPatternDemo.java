package cn.learn.learn.mvc.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.mvc.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class MVCPatternDemo {

    public static void main(String[] args){
        Student model = new Student();
        model.setName("reboot");
        model.setRollNo("33");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        controller.updateView();

        controller.setStudentName("John");
        controller.updateView();
    }

}

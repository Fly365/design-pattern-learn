package cn.learn.learn.visitor.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.visitor.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-05日
 */
public class VisitorPatternDemo {

    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVistor());
    }

}

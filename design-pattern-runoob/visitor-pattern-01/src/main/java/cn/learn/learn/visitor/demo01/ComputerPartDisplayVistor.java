package cn.learn.learn.visitor.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.visitor.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-05日
 */
public class ComputerPartDisplayVistor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("display computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display monitor");
    }
}

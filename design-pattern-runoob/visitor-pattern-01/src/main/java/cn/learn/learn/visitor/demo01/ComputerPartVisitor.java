package cn.learn.learn.visitor.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.visitor.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-05日
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}

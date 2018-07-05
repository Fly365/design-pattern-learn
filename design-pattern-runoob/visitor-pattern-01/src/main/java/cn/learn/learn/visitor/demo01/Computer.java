package cn.learn.learn.visitor.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.visitor.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-05日
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(),new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i = 0; i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

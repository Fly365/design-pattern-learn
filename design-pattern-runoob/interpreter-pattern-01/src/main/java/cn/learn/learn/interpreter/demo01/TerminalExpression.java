package cn.learn.learn.interpreter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.interpreter.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

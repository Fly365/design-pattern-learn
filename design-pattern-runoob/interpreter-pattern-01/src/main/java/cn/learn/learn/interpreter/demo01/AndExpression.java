package cn.learn.learn.interpreter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.interpreter.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class AndExpression implements Expression {

    private Expression expre1;
    private Expression expre2;

    public AndExpression(Expression expre1, Expression expre2){
        this.expre1 = expre1;
        this.expre2 = expre2;
    }

    @Override
    public boolean interpret(String context) {
        return expre1.interpret(context) && expre2.interpret(context);
    }
}

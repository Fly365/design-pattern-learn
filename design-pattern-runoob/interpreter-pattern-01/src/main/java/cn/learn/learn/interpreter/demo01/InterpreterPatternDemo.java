package cn.learn.learn.interpreter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.interpreter.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class InterpreterPatternDemo {

    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male? " + isMale.interpret("john"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("married julie"));
    }

    public static Expression getMaleExpression(){
        Expression rebert = new TerminalExpression("rebert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(rebert,john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
        return new OrExpression(julie,married);

    }



}

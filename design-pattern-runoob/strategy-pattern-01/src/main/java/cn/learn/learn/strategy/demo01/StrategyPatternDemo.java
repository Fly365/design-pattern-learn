package cn.learn.learn.strategy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.strategy.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class StrategyPatternDemo {

    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("add 10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());
        System.out.println("substract 10 -5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("multiply 10 * 5 = " + context.executeStrategy(10,5));


    }


}

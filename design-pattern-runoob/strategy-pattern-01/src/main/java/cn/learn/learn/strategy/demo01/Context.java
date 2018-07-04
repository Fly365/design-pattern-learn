package cn.learn.learn.strategy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.strategy.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }


}

package cn.learn.learn.strategy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.strategy.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

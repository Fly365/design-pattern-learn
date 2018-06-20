package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}

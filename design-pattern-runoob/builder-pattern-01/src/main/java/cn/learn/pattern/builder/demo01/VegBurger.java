package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

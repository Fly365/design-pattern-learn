package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 * @author : WXF
 * @date : 2018年-06月-18日
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

}

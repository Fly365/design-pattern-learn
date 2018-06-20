package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}

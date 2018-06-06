package cn.learn.factory.demo01.model;

/**
 * design-pattern-runoob-cn.learn.factory.demo01.model
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("inside red :: fill()");
    }
}

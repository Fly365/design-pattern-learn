package cn.learn.learn.decorator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.decorator.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle::draw");
    }
}

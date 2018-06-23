package cn.learn.learn.prototype.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle::draw()");
    }
}

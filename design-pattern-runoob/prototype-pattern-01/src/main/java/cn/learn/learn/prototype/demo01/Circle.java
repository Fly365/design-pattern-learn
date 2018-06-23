package cn.learn.learn.prototype.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }


    @Override
    void draw() {
        System.out.println("circle::draw()");
    }
}

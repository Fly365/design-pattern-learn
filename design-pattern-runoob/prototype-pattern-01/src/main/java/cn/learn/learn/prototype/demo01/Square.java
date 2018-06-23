package cn.learn.learn.prototype.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }


    @Override
    void draw() {
        System.out.println("Square::draw()");
    }
}

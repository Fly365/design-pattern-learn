package cn.learn.learn.bridge.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.bridge.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class Circle extends Shape{

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}

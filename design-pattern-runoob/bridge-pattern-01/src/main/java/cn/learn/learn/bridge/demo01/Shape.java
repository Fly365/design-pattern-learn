package cn.learn.learn.bridge.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.bridge.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}

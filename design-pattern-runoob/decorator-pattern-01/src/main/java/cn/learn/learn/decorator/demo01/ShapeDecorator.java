package cn.learn.learn.decorator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.decorator.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }


}

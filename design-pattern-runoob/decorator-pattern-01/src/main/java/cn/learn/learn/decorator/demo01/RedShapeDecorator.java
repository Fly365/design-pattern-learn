package cn.learn.learn.decorator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.decorator.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("border color:red");
    }
}

package cn.learn.factory.demo01;

/**
 * design-pattern-runoob-cn.learn.factory.demo01
 * @author : WXF
 * @date : 2018年-06月-05日
 */
public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();


    }

}

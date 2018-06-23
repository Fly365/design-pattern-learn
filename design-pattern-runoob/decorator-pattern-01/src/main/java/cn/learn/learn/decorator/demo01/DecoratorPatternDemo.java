package cn.learn.learn.decorator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.decorator.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class DecoratorPatternDemo {

    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();

        System.out.println("--------------------------");

        redCircle.draw();

        System.out.println("--------------------------");

        redRectangle.draw();


    }


}

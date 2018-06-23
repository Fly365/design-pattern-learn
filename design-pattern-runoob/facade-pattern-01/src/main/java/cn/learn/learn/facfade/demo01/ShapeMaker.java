package cn.learn.learn.facfade.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.facfade.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }


    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }


}

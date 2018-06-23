package cn.learn.learn.facfade.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.facfade.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class FacadePatternDemo {

    public static void main(String[] args){

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();


    }


}

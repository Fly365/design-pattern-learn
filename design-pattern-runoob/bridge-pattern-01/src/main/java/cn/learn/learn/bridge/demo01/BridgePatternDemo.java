package cn.learn.learn.bridge.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.bridge.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class BridgePatternDemo {

    public static void main(String[] args){
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }


}

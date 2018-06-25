package cn.learn.learn.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * design-pattern-runoob-cn.learn.learn.flyweight.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-25日
 */
public class ShapeFactory {

    private static final Map<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("creating circle of color:" + color);
        }
        return circle;
    }

}

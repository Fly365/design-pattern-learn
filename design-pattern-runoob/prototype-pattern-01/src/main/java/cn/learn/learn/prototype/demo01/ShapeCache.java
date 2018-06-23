package cn.learn.learn.prototype.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class ShapeCache {

    private static Map<String,Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("circle");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("square");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeMap.put(rectangle.getId(),rectangle);

    }






}

package cn.learn.factory.demo01;

/**
 * design-pattern-runoob-cn.learn.factory.demo01
 * @author : WXF
 * @date : 2018年-06月-05日
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }

        return null;
    }

}

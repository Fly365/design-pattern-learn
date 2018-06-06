package cn.learn.factory.demo01.factory;

import cn.learn.factory.demo01.model.*;

/**
 * design-pattern-runoob-cn.learn.factory.demo01.factory
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
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

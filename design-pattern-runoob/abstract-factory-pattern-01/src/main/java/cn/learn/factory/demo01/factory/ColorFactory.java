package cn.learn.factory.demo01.factory;

import cn.learn.factory.demo01.model.*;

/**
 * design-pattern-runoob-cn.learn.factory.demo01.factory
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if("blue".equalsIgnoreCase(colorType)){
            return new Blue();
        }else if("red".equalsIgnoreCase(colorType)){
            return new Red();
        }else if("green".equalsIgnoreCase(colorType)){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}

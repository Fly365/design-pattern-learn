package cn.learn.factory.demo01.factory;

import cn.learn.factory.demo01.model.Color;
import cn.learn.factory.demo01.model.Shape;

/**
 * design-pattern-runoob-cn.learn.factory.demo01.factory
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);
}

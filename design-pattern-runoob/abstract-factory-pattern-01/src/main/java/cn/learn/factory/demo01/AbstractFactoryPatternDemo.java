package cn.learn.factory.demo01;

import cn.learn.factory.demo01.factory.AbstractFactory;
import cn.learn.factory.demo01.factory.FactoryProducer;
import cn.learn.factory.demo01.model.Color;
import cn.learn.factory.demo01.model.Shape;

/**
 * design-pattern-runoob-cn.learn.factory.demo01
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");


        Shape circle = shapeFactory.getShape("circle");
        circle.draw();


        Color blue = colorFactory.getColor("blue");
        blue.fill();

    }


}

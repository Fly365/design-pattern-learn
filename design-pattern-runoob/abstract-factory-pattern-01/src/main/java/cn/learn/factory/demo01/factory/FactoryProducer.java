package cn.learn.factory.demo01.factory;

/**
 * design-pattern-runoob-cn.learn.factory.demo01.factory
 * @author : WXF
 * @date : 2018年-06月-06日
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice == null){
            return null;
        }

        if("shape".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }

}

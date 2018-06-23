package cn.learn.learn.prototype.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class PrototypePatternDemo {

    public static void main(String[] args){

        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("circle");
        System.out.println(clonedCircle.getType());

        Shape cloneSquare = ShapeCache.getShape("square");
        System.out.println(cloneSquare.getType());


    }


}

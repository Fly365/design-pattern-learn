package cn.learn.learn.composite_entity.pattern.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.composite_entity.pattern.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args){
        Client client = new Client();
        client.setData("data1", "data2");
        client.printData();
    }



}

package cn.learn.learn.proxy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.proxy.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-25日
 */
public class ProxyPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("dd.jpg");
        image.display();
        System.out.println("------------------");
        image.display();
    }


}

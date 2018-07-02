package cn.learn.learn.command.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.command.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-30日
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("stock [name:" + name + ",quantity:" + quantity + "] bought");
    }

    public void shell(){
        System.out.println("stock [name:" + name + ",quantity:" + quantity + "] sold");
    }

}

package cn.learn.singleton.demo01;

/**
 * design-pattern-runoob-cn.learn.singleton.demo01
 * @author : WXF
 * @date : 2018年-06月-09日
 */
public class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    /**构造函数私有化，以便类不能够实例化*/
    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMsg(){
        System.out.println("singleton pattern");
    }


}

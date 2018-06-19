package cn.learn.singleton.demo01;

/**
 * design-pattern-runoob-cn.learn.singleton.demo01
 * @author : WXF
 * @date : 2018年-06月-13日
 */
public enum Singleton {

    INSTANCE;

    public void showMsg(){
        System.out.println("singleton");
    }

}

package cn.learn.singleton.demo01;

/**
 * design-pattern-runoob-cn.learn.singleton.demo01
 * @author : WXF
 * @date : 2018年-06月-13日
 */
public class SingletonObject2 {

    private SingletonObject2(){}

    private volatile static SingletonObject2 instance;

    public static SingletonObject2 getInstance(){
        if (instance == null){
            synchronized (SingletonObject2.class){
                if (instance == null){
                    instance = new SingletonObject2();
                }
            }
        }
        return instance;
    }

}

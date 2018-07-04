package cn.learn.learn.template.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.template.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class Football extends Game {
    @Override
    public void inittialize() {
        System.out.println("football init");
    }

    @Override
    public void startPlay() {
        System.out.println("football start");
    }

    @Override
    public void endPlay() {
        System.out.println("football end");
    }
}

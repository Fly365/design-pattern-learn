package cn.learn.learn.template.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.template.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class Circket extends Game {
    @Override
    public void inittialize() {
        System.out.println("circket init");
    }

    @Override
    public void startPlay() {
        System.out.println("circket start");
    }

    @Override
    public void endPlay() {
        System.out.println("circket end");
    }
}

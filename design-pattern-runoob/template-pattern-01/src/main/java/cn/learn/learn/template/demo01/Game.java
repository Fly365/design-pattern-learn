package cn.learn.learn.template.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.template.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public abstract class Game {

    public abstract void inittialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public final void play(){
        inittialize();
        startPlay();
        endPlay();
    }

}

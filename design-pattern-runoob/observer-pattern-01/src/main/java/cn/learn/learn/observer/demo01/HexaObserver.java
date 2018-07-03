package cn.learn.learn.observer.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.observer.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-03日
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hex string:" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}

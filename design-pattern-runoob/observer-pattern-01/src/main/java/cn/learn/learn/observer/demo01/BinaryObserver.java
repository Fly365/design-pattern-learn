package cn.learn.learn.observer.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.observer.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-03日
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary string: " + Integer.toBinaryString(subject.getState()));
    }
}

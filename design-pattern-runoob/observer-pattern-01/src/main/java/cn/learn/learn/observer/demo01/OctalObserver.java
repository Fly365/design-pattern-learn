package cn.learn.learn.observer.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.observer.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-03日
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("octal string:" + Integer.toOctalString(subject.getState()));
    }
}

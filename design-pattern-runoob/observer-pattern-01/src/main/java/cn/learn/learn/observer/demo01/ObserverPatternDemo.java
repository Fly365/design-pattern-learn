package cn.learn.learn.observer.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.observer.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-03日
 */
public class ObserverPatternDemo {

    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);

        System.out.println("----------------");

        subject.setState(10);

    }


}

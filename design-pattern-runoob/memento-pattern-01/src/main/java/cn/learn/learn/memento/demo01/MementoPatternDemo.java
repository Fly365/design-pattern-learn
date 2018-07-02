package cn.learn.learn.memento.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.memento.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-02日
 */
public class MementoPatternDemo {

    public static void main(String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");

        System.out.println("current state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First save state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second save state:" + originator.getState());
    }

}

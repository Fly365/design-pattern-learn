package cn.learn.learn.memento.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.memento.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-02日
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}

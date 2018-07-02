package cn.learn.learn.memento.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.memento.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-02日
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }


}

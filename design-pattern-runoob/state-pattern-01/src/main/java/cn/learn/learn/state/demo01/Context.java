package cn.learn.learn.state.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.state.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

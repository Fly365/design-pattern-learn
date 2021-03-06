package cn.learn.learn.state.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.state.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}

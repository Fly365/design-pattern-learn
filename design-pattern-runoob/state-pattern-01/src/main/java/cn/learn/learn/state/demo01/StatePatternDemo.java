package cn.learn.learn.state.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.state.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class StatePatternDemo {

    public static void main(String[] args){
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }


}

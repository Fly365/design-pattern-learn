package cn.learn.learn.mediator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.mediator.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class MediatorPatternDemo {

    public static void main(String[] args){
        User rebert = new User("rebert");
        User john = new User("john");

        rebert.sendMessage("Hi,john");
        john.sendMessage("Hello,rebert");
    }


}

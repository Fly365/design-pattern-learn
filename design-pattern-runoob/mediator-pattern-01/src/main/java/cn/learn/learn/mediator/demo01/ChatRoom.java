package cn.learn.learn.mediator.demo01;

import java.util.Date;

/**
 * design-pattern-runoob-cn.learn.learn.mediator.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "]:" + message);
    }
}

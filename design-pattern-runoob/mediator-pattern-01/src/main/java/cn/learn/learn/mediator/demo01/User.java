package cn.learn.learn.mediator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.mediator.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}

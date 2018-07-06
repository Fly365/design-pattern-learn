package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class Client {

    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }


    public void doTask(){
        businessDelegate.doTask();
    }
}

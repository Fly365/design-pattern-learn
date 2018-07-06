package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args){
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }



}

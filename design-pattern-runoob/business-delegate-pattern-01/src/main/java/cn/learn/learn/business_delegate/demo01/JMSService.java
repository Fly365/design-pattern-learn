package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("JMS service processing");
    }
}

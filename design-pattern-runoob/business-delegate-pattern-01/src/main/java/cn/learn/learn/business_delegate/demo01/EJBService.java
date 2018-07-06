package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("EJB service processing");
    }
}

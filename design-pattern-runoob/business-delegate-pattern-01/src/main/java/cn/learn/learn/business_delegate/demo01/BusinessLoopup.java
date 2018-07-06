package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class BusinessLoopup {

    public BusinessService getBuesinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }

}

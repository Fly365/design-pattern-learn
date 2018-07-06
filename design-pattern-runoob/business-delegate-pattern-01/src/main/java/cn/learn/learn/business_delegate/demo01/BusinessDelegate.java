package cn.learn.learn.business_delegate.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.business_delegate.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class BusinessDelegate {

    private BusinessLoopup loopup = new BusinessLoopup();
    private BusinessService service;
    private String serviceType;


    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        service = loopup.getBuesinessService(serviceType);
        service.doProcessing();
    }


}

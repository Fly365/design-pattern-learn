package cn.learn.learn.null_object.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.null_object.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public Boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

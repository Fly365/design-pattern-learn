package cn.learn.learn.null_object.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.null_object.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public Boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "not avaliable in customer database";
    }
}

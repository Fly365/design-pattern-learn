package cn.learn.learn.null_object.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.null_object.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class NullPatternDemo {

    public static void main(String[] args){
        AbstractCustomer customer1 = CustomerFactory.getCustomer("aa");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("cc");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("dd");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());

    }


}

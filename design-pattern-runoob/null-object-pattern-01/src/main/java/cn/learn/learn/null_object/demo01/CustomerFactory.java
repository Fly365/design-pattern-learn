package cn.learn.learn.null_object.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.null_object.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class CustomerFactory {

    public static final String[] names = {"aa","bb","cc"};

    public static AbstractCustomer getCustomer(String name){
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}

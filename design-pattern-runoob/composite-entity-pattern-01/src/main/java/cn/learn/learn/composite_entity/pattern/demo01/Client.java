package cn.learn.learn.composite_entity.pattern.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.composite_entity.pattern.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class Client {

    private CompositeEntity entity = new CompositeEntity();

    public void setData(String data1, String data2){
        entity.setData(data1, data2);
    }

    public void printData(){
        for(int i = 0; i < entity.getData().length; i++){
            System.out.println("Data: " + entity.getData()[i]);
        }
    }

}

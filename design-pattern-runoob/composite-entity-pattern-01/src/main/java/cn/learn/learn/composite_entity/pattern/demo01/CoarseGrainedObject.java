package cn.learn.learn.composite_entity.pattern.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.composite_entity.pattern.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class CoarseGrainedObject {

    private DependentObject1 object1 = new DependentObject1();

    private DependentObject2 object2 = new DependentObject2();


    public void setData(String data1, String data2){
        object1.setData(data1);
        object2.setData(data2);
    }

    public String[] getData(){
        return new String[]{object1.getData(),object2.getData()};
    }

}

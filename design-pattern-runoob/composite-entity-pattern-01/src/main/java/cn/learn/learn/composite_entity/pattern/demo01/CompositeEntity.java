package cn.learn.learn.composite_entity.pattern.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.composite_entity.pattern.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-06日
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }


}

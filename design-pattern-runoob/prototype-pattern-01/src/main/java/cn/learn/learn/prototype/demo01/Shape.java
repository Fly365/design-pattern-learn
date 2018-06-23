package cn.learn.learn.prototype.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.prototype.demo01
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

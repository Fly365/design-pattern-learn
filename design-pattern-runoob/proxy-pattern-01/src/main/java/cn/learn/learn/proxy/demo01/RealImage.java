package cn.learn.learn.proxy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.proxy.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-25日
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading " + fileName);
    }
}

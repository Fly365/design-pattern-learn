package cn.learn.learn.proxy.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.proxy.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-25日
 */
public class ProxyImage implements Image {

    private String fileName;

    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        // 这里实际调用是其他类的功能
        realImage.display();
    }
}

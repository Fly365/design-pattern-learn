package cn.learn.learn.bridge.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.bridge.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing circle: red, radius:" + radius + ",x:" + x + ",y:" + y);
    }
}

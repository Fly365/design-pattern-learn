package cn.learn.learn.adapter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.adapter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("operate nothing");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4Player::playMp4,"+fileName);
    }
}

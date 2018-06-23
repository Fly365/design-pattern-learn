package cn.learn.learn.adapter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.adapter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("vlcPlayer::playVlc," + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("operate nothing");
    }
}

package cn.learn.learn.adapter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.adapter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class AdapterPatternDemo {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();


        audioPlayer.play("mp3","aa.mp3");
        audioPlayer.play("mp4","aa.mp4");
    }

}

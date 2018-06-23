package cn.learn.learn.adapter.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.adapter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-21日
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3 file," + fileName);
        }else if(audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("invalid media " + audioType + " format not supported");
        }
    }
}

package cn.learn.learn.template.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.template.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-04日
 */
public class TemplatePatternDemo {

    public static void main(String[] args){
        Game game = new Circket();
        game.play();
        System.out.println("------------------");
        game = new Football();
        game.play();
    }


}

package cn.learn.pattern.chain.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.chain.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-29日
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error::logger:" + message);
    }
}

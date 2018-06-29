package cn.learn.pattern.chain.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.chain.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-29日
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug::Logger:" + message);
    }
}

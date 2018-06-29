package cn.learn.pattern.chain.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.chain.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-29日
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debug = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);


        error.setNextLogger(debug);
        debug.setNextLogger(console);

        return error;
    }


    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "info");
        System.out.println("-----------------------");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug");
        System.out.println("------------------------");
        loggerChain.logMessage(AbstractLogger.ERROR,"error");
    }



}

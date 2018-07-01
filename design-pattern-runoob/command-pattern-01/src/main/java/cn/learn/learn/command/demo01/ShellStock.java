package cn.learn.learn.command.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.command.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-30日
 */
public class ShellStock implements Order {

    private Stock stock;

    public ShellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.shell();
    }
}

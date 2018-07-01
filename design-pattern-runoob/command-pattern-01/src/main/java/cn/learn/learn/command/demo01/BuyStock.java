package cn.learn.learn.command.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.command.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-30日
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

package cn.learn.learn.command.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.command.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-30日
 */
public class CommandPatternDemo {

    public static void main(String[] args){
        Stock stock = new Stock();

        Order buyOrder = new BuyStock(stock);
        Order shellOrder = new ShellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(shellOrder);

        broker.placeOrders();
    }

}

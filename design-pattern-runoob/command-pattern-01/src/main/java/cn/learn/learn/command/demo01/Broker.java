package cn.learn.learn.command.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.command.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-30日
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }


}

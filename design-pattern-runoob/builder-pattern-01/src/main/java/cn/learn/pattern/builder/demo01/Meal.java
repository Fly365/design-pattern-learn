package cn.learn.pattern.builder.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.println("Item:" + item.name());
            System.out.println(",packing:" + item.packing().pack());
            System.out.println(",price:" + item.price());
        }
    }







}

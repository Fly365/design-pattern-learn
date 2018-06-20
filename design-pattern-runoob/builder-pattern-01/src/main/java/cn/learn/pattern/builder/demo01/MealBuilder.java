package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }



}

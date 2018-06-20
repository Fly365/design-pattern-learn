package cn.learn.pattern.builder.demo01;

/**
 * design-pattern-runoob-cn.learn.pattern.builder.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-20日
 */
public class BuilderPatternDemo {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }


}

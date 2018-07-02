package cn.learn.learn.iterator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.iterator.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class IteratorPatternDemo {

    public static void main(String[] args){
        NameResitory nameResitory = new NameResitory();
        for(Iterator iter = nameResitory.getIterator(); iter.hasNext();){
            String name = String.valueOf(iter.next());
            System.out.println("name:" + name);
        }
    }

}

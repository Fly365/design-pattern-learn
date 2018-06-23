package cn.learn.learn.filter.demo01;

import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);


}

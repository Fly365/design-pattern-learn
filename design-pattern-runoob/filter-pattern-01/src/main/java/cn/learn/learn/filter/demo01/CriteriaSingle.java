package cn.learn.learn.filter.demo01;

import java.util.List;
import java.util.stream.Collectors;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "single".equalsIgnoreCase(person.getMaritalStatus()))
                .collect(Collectors.toList());
    }
}

package cn.learn.learn.filter.demo01;

import java.util.List;
import java.util.stream.Collectors;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "female".equalsIgnoreCase(person.getGender()))
                .collect(Collectors.toList());
    }
}

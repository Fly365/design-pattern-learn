package cn.learn.learn.filter.demo01;

import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}

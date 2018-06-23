package cn.learn.learn.filter.demo01;

import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for(Person person : otherCriteriaItems){
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}

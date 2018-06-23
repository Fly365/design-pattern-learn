package cn.learn.learn.filter.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern-runoob-cn.learn.learn.filter.demo01
 *
 * @author : WXF
 * @date : 2018年-06月-23日
 */
public class CriteriaPatternDemo {


    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria femal = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria andCriteria = new AndCriteria(male,single);
        Criteria orCriteria = new OrCriteria(femal,single);

        male.meetCriteria(persons).forEach(System.out::println);

        System.out.println("---------------------------");
        femal.meetCriteria(persons).forEach(System.out::println);

        System.out.println("-----------------------------------");

        andCriteria.meetCriteria(persons).forEach(System.out::println);

        System.out.println("----------------------------------------");

        orCriteria.meetCriteria(persons).forEach(System.out::println);


    }



}

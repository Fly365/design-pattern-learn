package cn.learn.learn.iterator.demo01;

/**
 * design-pattern-runoob-cn.learn.learn.iterator.demo01
 *
 * @author : WXF
 * @date : 2018年-07月-01日
 */
public class NameResitory implements Container {

    private String[] nameArr = {"aa","bb","cc","dd"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < nameArr.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return nameArr[index++];
            }
            return null;
        }
    }
}

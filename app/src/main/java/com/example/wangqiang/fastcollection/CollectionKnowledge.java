package com.example.wangqiang.fastcollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Java的集合类
 * 1可以用于存储多个对象。
 * 2还可以用于实现常用的数据结构。
 * 3还可以用于保存具有映射关系的数组。
 *
 * Java 集合类主要由 Conllection 和 Map两个接口 派生而来
 *   Conllection
 *             |--Set
 *             | (无序集合，元素不可重复)
 *             |--List
 *             | (有序集合，元素可重复)
 *             |--Queue
 *             | (队列)
 * 增加
 * boolean add(E e);
 * boolean addAll(Collection<? extends E> c)
 * 删除
 * boolean remove(Object o);
 * boolean removeAll(Collection<?> c);删除c集合
 * boolean retainAll(Collection<?> c);删除c中不包含的元素
 * void clear();长度为0
 * 判断
 * boolean isEmpty();
 * boolean contains(Object o);是否包含o
 * boolean containsAll(Collection<?> c); 是否包含所有c里的元素。
 * 转换
 * Object[] toArray();
 * 遍历
 * terator<E> iterator();
 */

public class CollectionKnowledge {
    public void init(){
        Collection c ;
    }

    /**
     * for和foreach 也会引发异常。
     */
    public void testInterator(){
        Collection books = new HashSet();
        books.add("111");
        books.add("222");
        books.add("333");
        Iterator iterator = books.iterator();
        while (iterator.hasNext()){
            String  bookName = (String) iterator.next();
            System.out.print(bookName);
            if (bookName.equals("111")){
                //Iterator 采用快速失败机制，一旦检测被修改，立刻引发ConcurrentModificaticonException
                books.remove(bookName);
            }
        }
    }
}

package app.Iterator;

/**
 * Iterator
 */
public interface Iterator<E> {
    boolean hasNext();// 判断是否存在下一个对象元素

    E next();// 获取下一个元素

    void remove();// 移除元素
}
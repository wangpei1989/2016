package Collections;

import java.util.LinkedList;
/**
 * 进出栈实现的是只对列表的一端进行add remove
 * @author wangpei
 *
 * @param <E>
 */
public class LinkedListStack<E>{
	
    private  LinkedList<E> linkedList =  new LinkedList<E>();
    
    //新增元素推入栈尾 
    public void insert(E e){
    	  
    	linkedList.addFirst(e);
    }
    
    @Override
	public String toString() {
		return "LinkedListStack [linkedList=" + linkedList + "]";
	}

	//删除元素从栈尾删除
    public void delete(){
    	linkedList.removeFirst();
    }
    
    //清空栈
    public void empty(){
    	
    	linkedList.clear();
    }
    
    //判断栈是否为空
    public boolean isEmpty(){
    	return linkedList.isEmpty();
    	
    }

}

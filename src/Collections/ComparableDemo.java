package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 实现comparable接口，进行对比
 * hashcode  相当于对象的一个物理地址，返回int；
 * equals  比较内容，返回boolean
 * @author wangpei
 *
 */
public class ComparableDemo {

	public static void main(String[] str) throws InterruptedException{
		
		List<Person> list = new ArrayList<Person>();
		Person p =  new Person("zhang","san");
		Person p1 = new Person("zhang", "san");
		Person p2 = new Person("zhang","si");
		Person p3 = new Person("li","si");
		/**
		 * equals比较对象，直接调用equals
		 */
		System.out.println("===== equals   "+p.equals(p1));
		
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		/**
		 * hash集合中，想要存储，就要先比较hash值，如果相同则相同不存储；如果不同比较equals，相同不存储；
		 * 如果都相同，则只存储一个，不留重复对象
		 */
		final Set<Person> set = new HashSet<Person>();
		final Set<Person> synchronizedSet = Collections.synchronizedSet(set);
		final Person p4 = new Person("AAAAA", "BBBBBB");
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronizedSet.add(p4);
			    System.out.println("in add======"+synchronizedSet.size());
				
			}
		});
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				if (synchronizedSet.contains(p4)){
					System.out.println("contain!!");
					synchronizedSet.remove(p4);
				}
			  
			    System.out.println("in remove======"+synchronizedSet.size());
				
			}
		});
		t.start();
		//t1.sleep(1000);
		t1.start();
		synchronizedSet.add(p);
		synchronizedSet.add(p1);
		System.out.println("=====set::"+set);
		/**
		 * 与hashcode、equals无关，走compareTo方法；
		 * 之所以在复写compareTo时要求同时复写equals的原因就在这里，保证不管是什么结构，逻辑都一致
		 */
		Set<Person> treeSet = new TreeSet<Person>();
		treeSet.add(p);
		treeSet.add(p1);
		System.out.println("=====tree::"+treeSet);
		System.out.println("sort before..."+list);
		/**
		 * sort进行比较，调用compareTo；此时comparable实现类中不强制要求复写equals，但复写保证逻辑一致 
		 */
		Collections.sort(list);
		
		//System.out.println("sort after..."+list);
		
		
		
	}

}

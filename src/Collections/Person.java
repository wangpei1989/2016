package Collections;

import java.util.Random;

public class Person implements Comparable<Person> {

	private String firstName;   //名
	private String lastName; //姓
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * 复写hashcode
	 * 实现只要 两个name相同，则认为两个对象的hashcode相同
	 */
	@Override
	public int hashCode(){
		
		System.out.println("....in hashcode...");
		return (int) (Math.random()+lastName.hashCode()+firstName.hashCode());
		
	}
	
	/**
	 * 复写equals
	 * 比较两个对象的
	 * 源码中调用equals是先调用hashcode方法 
	 */
	//对比两个对象是否相等
	public boolean equals(Object obj){
		
		System.out.println("in equals....");
		if (!(obj instanceof Person)){
			return false;
		}
		Person p = (Person)obj;
		return lastName.equals(p.getLastName())&&firstName.equals(p.getFirstName());
		
	}
	
	/**
	 * 复写compareTo方法，实现对比
	 * firstName lastName均相同，就认为两个对象相同
	 */
	//对集合对象进行内部排序，要重写compareTo，但不要求重写equals；但为了保证逻辑上一致，推荐复写equals
	@Override
	public int compareTo(Person o) {
		System.out.println("compareTo....");
		int tmp = lastName.compareTo(o.getLastName());
		return tmp != 0? tmp : firstName.compareTo(o.getFirstName());
	}

	@Override
	public String toString() {
		return lastName+" "+firstName;
	}
	
	
	
	
}

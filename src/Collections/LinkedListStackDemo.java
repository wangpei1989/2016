package Collections;
/**
 * 使用linkedList模拟堆栈特性 先进后出
 * @author wangpei
 *
 */
public class LinkedListStackDemo {
	
	
	public static void main(String[] args) {
		
		final LinkedListStack<String> stack = new LinkedListStack<String>();
		final boolean empty = stack.isEmpty();
		System.out.println("is empty?  "+empty);
		
		stack.insert("AAAAA");
		stack.insert("BBBBB");
		stack.insert("CCCCC");
		System.out.println("stack..."+stack);
		stack.delete();
		System.out.println("stack!!!"+stack);
		
	}
	

}

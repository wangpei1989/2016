package Thread;

public class Consumer extends Thread {
	
	private int value;
	private Boolean flag = false;
	private Container container;
	
	public Consumer(Container c,int v){
		
		container = c;
		value = v;
		
	}
	
	public void run(){
		
		for (int i = 0;i < 5; i++){
			container.get(i);
		}
		
	}

}

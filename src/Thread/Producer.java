package Thread;

public class Producer extends Thread{
	
	private int value;
	private Boolean flag = false;
	private Container container;
	
	public Producer(Container c, int v){
		
		this.container = c;
		this.value = v;	
	}
	
	public void run(){
		for (int i = 0;i < 5;i++){
			
			container.put(i, value);
		}
		
		
		
	}

}

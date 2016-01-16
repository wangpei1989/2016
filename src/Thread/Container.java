package Thread;

public class Container {

	
	private Boolean flag = false;
	/*
	 * consumer  
	 */
	public synchronized void get(int who){
		while (flag == false){
			
			try{
				//不满足要求睡眠，等符合要求被通知
				this.wait();
				
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		//执行完成后要通知put方法
		flag = false;
		this.notifyAll();
		System.out.println("in consumer!!  ");
	}
	
	/*
	 * producer
	 */
	public synchronized void put(int who, int value){
		
		while (flag == true){
			try{
				//此时应该执行consumer的方法 等待
				this.wait();
				
			} catch (Exception e){
				
				throw new RuntimeException(e);
		
			}
			
		}
		flag = true;
		//执行完put后要开始执行get，因为get可能被阻止，这里进行通知
		this.notifyAll();
		System.out.println(".... producer in!!! "+who+"   "+value);
		
		
		
	} 
}

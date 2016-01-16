package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 实现线程通信
 * @author wangpei
 *
 */
public class syntronizedConnection {
	


	public static  void main(String[] str) throws IOException{
		
		System.out.println("input score is : ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String st;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while ((st = bufferedReader.readLine())!= null){
			
			//回车结束
			if (st.length()<=0){
				break;
			}
			System.out.println("st::   "+st);
			list.add(Integer.parseInt(st));
			
		}
		
		for (Integer i : list) {
			System.out.println("list..."+i);
		}
		
		Container c = new Container();
		Producer p = new Producer(c,11);
		Consumer e = new Consumer(c, 21);
		
		p.start();
		e.start();
		
	}


}

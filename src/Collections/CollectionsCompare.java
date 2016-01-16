package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 实现对单词长度的比较,从大到小排序
 * @author wangpei
 *
 */
public class CollectionsCompare {
	
	static final Comparator<String> ORDER_BY_LENGTH = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			
			return o1.length() > o2.length()?-1:(o1.length() == o2.length())?0:1;
		}
		
	};
	
	public static void main(String[] str){
		
		List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("zhangsam");
		list.add("zhangsao");
		list.add("zhangsansan");
		list.add("zhang");
		list.add("z");
		list.add("Z");
		Collections.sort(list);
		/**
		 * 按默认顺序进行排序
		 */
		System.out.println("====before: "+list);
		Collections.sort(list, ORDER_BY_LENGTH);
		System.out.println("===after: "+list);
		
		/**
		 * ====before: [Z, z, zhang, zhangsam, zhangsan, zhangsansan, zhangsao]
			===after: [zhangsansan, zhangsam, zhangsan, zhangsao, zhang, Z, z]
		 */
		
	}

}

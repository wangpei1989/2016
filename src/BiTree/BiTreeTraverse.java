package BiTree;

import java.util.Scanner;
/**
 * 二叉树计算过程
 * @author wangpei
 *
 */
public class BiTreeTraverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入二叉树先根遍历的序列：  ");
	    String next = scanner.next();
	    System.out.println("next..."+next);
	    //获取二叉树结构
	    BiTree biTree = new BiTree(next);
	    preTraverse(biTree.getRoot());
	    midTraverse(biTree.getRoot());
		scanner.close();
	}
	
	//先根遍历
	/**
	 * @param T
	 */
	private static void preTraverse(BiTreeNode T){
		
		if (T != null){
			//获取根结点
			System.out.println("pre root=== "+T.getNodeValue());
			//获取左孩子结点
			preTraverse(T.getlChild());
			preTraverse(T.getrChild());			
		}
		
	}
	
	/**
	 * 中根遍历
	 */
	private static void midTraverse(BiTreeNode T){
		if (T != null){
			
			midTraverse(T.getlChild());
			System.out.println("mid root=== "+T.getNodeValue());
			midTraverse(T.getrChild());
			
		}
		
		
	}

	
	
}

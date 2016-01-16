package BiTree;
/**
 * 根结点定义
 * @author wangpei
 *
 */
public class BiTree {
	/**
	 * 根节点
	 */
	private BiTreeNode root;
	
	public BiTreeNode getRoot() {
		return root;
	}
	public void setRoot(BiTreeNode root) {
		this.root = root;
	}
	private static int index = 0;
	/**
	 * 复写构造函数，构造二叉树
	 */
	public BiTree(String preStr){
		int length = preStr.length();
		System.out.println("length==="+length);
		char c = preStr.charAt(index++);
		System.out.println("c==="+c+"   index==="+index);
		if (c != '#'){
			
			System.out.println("in1-----");
			root = new BiTreeNode(c);  //根结点
			root.setlChild(new BiTree(preStr).root);  //建立左孩子结点
			root.setrChild(new BiTree(preStr).root);   //建立右孩子结点
		

		}else{
			System.out.println("in2-----");
			root = null;
		}
		
	}

}

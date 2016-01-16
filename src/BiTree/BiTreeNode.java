package BiTree;
/**
 * 二叉树的结点定义
 * @author wangpei
 *
 */
public class BiTreeNode {
	
	public Object getNodeValue() {
		return nodeValue;
	}
	public void setNodeValue(Object nodeValue) {
		this.nodeValue = nodeValue;
	}
	public BiTreeNode getlChild() {
		return lChild;
	}
	public void setlChild(BiTreeNode lChild) {
		this.lChild = lChild;
	}
	public BiTreeNode getrChild() {
		return rChild;
	}
	public void setrChild(BiTreeNode rChild) {
		this.rChild = rChild;
	}

	private Object nodeValue;
	private BiTreeNode lChild;
	private BiTreeNode rChild;
	
	public BiTreeNode(){
		this.nodeValue = null;
		this.lChild = null;
		this.rChild = null;
	}
	/**
	 * 构造一个左右子树均为空的结点（叶结点）
	 * @param nodeValue
	 */
	public BiTreeNode(Object nodeValue){
		this.nodeValue = nodeValue;
		this.lChild = null;
		this.rChild = null;
		
	}
	
	/**
	 * 构造一个数据域、左右孩子域均不为空的二叉树
	 */
	public BiTreeNode(Object nodeValue,BiTreeNode lChild,BiTreeNode rChild){
		
		this.nodeValue = nodeValue;
		this.lChild = lChild;
		this.rChild = rChild;
	}
	

}

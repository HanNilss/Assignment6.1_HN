/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	
	/**
	 * Creates a node object with data passed as argument. right and left children are set to null.
	 * @param data to be set
	 */
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}//end constructor
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}//end getData
	
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}//end setData
	
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}//end getlChild
	
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}//end setlChild
	
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}//end getrChild
	
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}//end setrChild
	
}//end class

/**
 * Class describing a depth first search of a binary tree.
 * @author hNilsson
 * CS215
 */
public class DepthFirstSearch {       
       Node root;
       int traversed = 0;
       int height = 0;
       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }//end constructor
       
       /**
        * Does a pre-order Depth-first search of binary tree starting from node passed in.
        * @param node to start search at
        */
       public void DFS(Node node)        {
        		root = node;       
        			if(node == null) {
                	   return;
                   }//end if
       				
                   System.out.println(node.getData());
                   DFS(node.getlChild());
                   DFS(node.getrChild());
                   traversed++;
                   
        }//end DFS

       /**
        * @return How many nodes have been traversed during the search
        */
        public int getTraversed() {
        	return this.traversed;
        }//end getTraversed
        
}//end class
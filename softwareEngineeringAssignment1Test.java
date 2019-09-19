import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class softwareEngineeringAssignment1Test {
	// test off a basic search tree.
	@Test
	void basicTest() {
	     BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1(); 
	     tree.root = new Node(1); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4); 
	     tree.root.left.right = new Node(5); 
	     tree.root.right.left = new Node(6); 
	     tree.root.right.right = new Node(7);
	     int result = 2;
	     assertEquals("Checking basic answer",result,tree.findLCA(4, 5));
	     result = 1;
	     assertEquals("Checking basic answer",result,tree.findLCA(4, 6));
	}
	//testing something that has no answer
	@Test
	void NoAnswertest() {
	     BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1(); 
	     System.out.println(tree.findLCA(0,0));
	     int result =-1;
	     assertEquals("Checking basic answer",result,tree.findLCA(0,0));
	}

	// found small test failure based on the definition of what the LCA is. 
	// lecture slides implied that LCA is the node above the two nodes if one node is directly above the other.
	// This code gives that if there is a straight line tree and you ask for the LCA the result is the node that is furthest up the tree.
	// As seen below the LCA could be 2 or 4. This program gives 4. 
	//testing something that has no answer
		@Test
		void straightLineTest() {
		     BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
		     tree.root = new Node(1); 
		     tree.root.left = new Node(2); 
		     tree.root.left.left = new Node(4); 
		     tree.root.left.left.left = new Node(5); 
		     int result = 4;
		     assertEquals("Checking straight left line ",result,tree.findLCA(4,5));
		}
		
	// Testing to see what happens when there are 2 possible answers
	// Will return the leftmost deepest answer.
		@Test
		void MultiplesAnswers() {
		     BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
		     tree.root = new Node(1); 
		     tree.root.left = new Node(2); 
		     tree.root.right = new Node(3);
		     tree.root.right.left = new Node(4);
		     tree.root.right.right = new Node(5);
		     tree.root.left.left = new Node(4); 
		     tree.root.left.right = new Node(5);
		     System.out.println(tree.findLCA(4,5));
		     int result = 2;
		     assertEquals("Checking straight left line ",result,tree.findLCA(4,5));
		}
		
		//One node test
		// One node will give -1. i.e not part of the tree.
		@Test
		void oneNodeTree() {
		     BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
		     tree.root = new Node(1); 
		     System.out.println(tree.findLCA(1,1));
		     int result = -1;
		     assertEquals("Checking straight left line ",result,tree.findLCA(4,5));
		}
		
}

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

}

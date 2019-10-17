import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class dagTest {

	dag testDag = new dag(5);
	dag testOne = new dag(1);
	@Test
	public void testDAGLowestCommonAncestor() {
		// test for disconnected graph
		assertTrue(testDag.lowestCommonAncestor(0, 0).isEmpty());
		// test for 1 node graph
		assertTrue(testOne.lowestCommonAncestor(0, 0).isEmpty());
		//test regular case
		testDag.addEdge(0,1);
		testDag.addEdge(0,2);
		testDag.addEdge(2,3);
		testDag.addEdge(3,4);
		int expectedAncestor = 0;
		int result = testDag.lowestCommonAncestor(1,2).get(0);
	    assertEquals("Checking basic answer",expectedAncestor,result);
	    expectedAncestor = 3;
	    // test answer when the two nodes are on the same branch 
		result = testDag.lowestCommonAncestor(4,3).get(0);
	    assertEquals("Checking answer for the same branch",expectedAncestor,result);
	    // test answer when the graph is circular.
	    testDag.addEdge(4,1);
	    expectedAncestor = 4;
		result = testDag.lowestCommonAncestor(1,4).get(0);
	    assertEquals("Checking answer for a circular tree",expectedAncestor,result);
	    
	    // test when there are 2 possible ancestors
	    dag testMulti= new dag(4);
	    testMulti.addEdge(0, 2);
	    testMulti.addEdge(0, 1);
	    testMulti.addEdge(0, 3);
	    testMulti.addEdge(1, 2);
	    testMulti.addEdge(1, 3);
	    result = testMulti.lowestCommonAncestor(2, 3).get(0);
	    int result0 = testMulti.lowestCommonAncestor(2, 3).get(1);
	    expectedAncestor = 0;
	    int expectedAncestor0 = 1;
	    assertEquals("Checking answer for answer when there are 2 possible answers."
	    		+ " 0 and 1 are both valid LCAs in this function. Should give both answers in an arrayList. Test for 0",expectedAncestor,result);
	    assertEquals("Checking answer for answer when there are 2 possible answers. "
	    		+ "0 and 1 are both valid LCAs in this function. Should give both answers in an arrayList. Test for 1.",expectedAncestor0,result0);
	    // test for when you have 2 nodes pointing at each other.
	    dag testBinary = new dag(2);
	    testBinary.addEdge(0, 1);
	    testBinary.addEdge(1, 0);
	    result = testBinary.lowestCommonAncestor(0, 1).get(0);
	    expectedAncestor = 0;
	    assertEquals("Test when answers point to each other. Due to the construction of the tree the node "
	    		+ "which comes first numerically will be the answer.",expectedAncestor,result);

	}
	
}

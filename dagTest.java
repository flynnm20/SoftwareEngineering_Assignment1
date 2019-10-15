import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dagTest {
	
    dag testDag = new dag(5);
	@Test
	public void testDAGLowestCommonAncestor() {
	testDag.addEdge(0,1);
	testDag.addEdge(0,2);
	testDag.addEdge(2,3);
	testDag.addEdge(3,4);
	int expectedAncestor = 0;
	int result = testDag.lowestCommonAncestor(1,2).get(0);
    assertEquals("Checking basic answer",expectedAncestor,result);
    expectedAncestor = 3;
	result = testDag.lowestCommonAncestor(4,3).get(0);
    assertEquals("Checking answer for the same tree",expectedAncestor,result);
    
    testDag.addEdge(4,1); // Makes the graph a directed circle.
    expectedAncestor = 4;
	result = testDag.lowestCommonAncestor(1,4).get(0);
	System.out.print(result);
    assertEquals("Checking answer for the same tree",expectedAncestor,result);
    
    testDag=null; // reset for new tests
    
	}

}

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dagTest {

	BST<Integer, Integer> bst = new BST<Integer,Integer>();
    @Test
    public void testNull(){
        assertNull("Testing the Null case", bst.lowestCommonAncestor(2,3));
    }
    @Test
    public void testOneNode(){
        bst.insert(1,1);
        assertNull("Testing the One Node case", bst.lowestCommonAncestor(2,3));
    }

}

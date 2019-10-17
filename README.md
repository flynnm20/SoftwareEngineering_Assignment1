# SoftwareEngineering_Assignment1

Construction of BST and Nodes.
The tree can be defined with no parameter. Then you can define a root node and define left and right branches for that node manually. 

LCA:
The LCA function first checks if the 2 elements exist in the BST. If they aren't -1 is returned. Then goes through the nodes in each path until it finds a node which is used in both paths. This then becomes the LCA.  


Testing of Code:
1: Basic test. Result: The correct LCA is selected.
2: Test where there is no answer. Result: The tree returns -1 when there is no answer.
3: Test when the two nodes are on the same branch. Result: The higher node is returned. Not the node above them.
4: When there are 2 possible answers. Result: The leftmost lowest common ancestor is the one returned.
5: One node tree. Result: Will return -1 for an an erro as there is no lca in that scenario. 

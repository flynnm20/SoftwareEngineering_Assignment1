# SoftwareEngineering_Assignment1

How to use:
1. construct DAG by entering dag yourGraph = new dag(int a).
2. add edges by using yourGraph.addEdge(int x) where a > x >=0.
3. to search for the lowest common ancestor use yourGraph.lowestCommonAncestor(w,y).get(0) where w&y are >=0 and <a.

Overview of Project Functionality.
DAG construction.
new dag(V): This creates V number of nodes which are stored in an array of ArrayLists called adj and another identical list called reverseAdj, used for finding LCA.

addEdge(int x, int y): 
This creates an edge going from x to y. The way this is represented is by adding an element to the arraylist under the index x of the adj array. This way direction is established. the function also checks if x and y are nodes in the set by checking if they are greater than 0 and less then V the number of nodes as well as checking if a path already exists.

lowestCommonAncestor(int x, int y)



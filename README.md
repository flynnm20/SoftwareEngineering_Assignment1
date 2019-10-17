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

lowestCommonAncestor(int x, int y):
x and y are the 2 nodes that we want to find the LCA of. If the inputs are invalid then an empty list is returned. An error is generated if the dag is null, null pointer exception. The function then uses directedDFS(directed dept first search) to find a path from the start of the function to the first node. Then reverseDFs is used to add the reverse to the reverseAdj. The process then enters a for loop. The loop cycles through all the visited nodes between the first node and x. If there exists a path between the current node i and y then the distance is measured. If the distance is smaller then the current max difference then it becomes the new lca. If there are multiple possible answers then they are all returned in a list.





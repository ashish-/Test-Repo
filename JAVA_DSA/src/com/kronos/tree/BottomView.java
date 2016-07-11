package com.kronos.tree;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BottomView {
	// Java Program to print Bottom View of Binary Tree
	
	 
	// Tree node class
	static class TreeNode
	{
	    int data; //data of the node
	    int hd; //horizontal distance of the node
	    TreeNode left, right; //left and right references
	 
	    // Constructor of tree node
	    public TreeNode(int key)
	    {
	        data = key;
	        hd = Integer.MAX_VALUE;
	        left = right = null;
	    }
	}
	 
	    TreeNode root; //root node of tree
	 
	    
	 
	    // Method that prints the bottom view.
	    public void bottomView()
	    {
	        if (root == null)
	            return;
	 
	        // Initialize a variable 'hd' with 0 for the root element.
	        int hd = 0;
	 
	        // TreeMap which stores key value pair sorted on key value
	        Map<Integer, Integer> map = new TreeMap<>();
	 
	         // Queue to store tree nodes in level order traversal
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	 
	        // Assign initialized horizontal distance value to root
	        // node and add it to the queue.
	        root.hd = hd;
	        queue.add(root);
	 
	        // Loop until the queue is empty (standard level order loop)
	        while (!queue.isEmpty())
	        {
	            TreeNode temp = queue.remove();
	 
	            // Extract the horizontal distance value from the
	            // dequeued tree node.
	            hd = temp.hd;
	 
	            // Put the dequeued tree node to TreeMap having key
	            // as horizontal distance. Every time we find a node
	            // having same horizontal distance we need to replace
	            // the data in the map.
	            map.put(hd, temp.data);
	 
	            // If the dequeued node has a left child add it to the
	            // queue with a horizontal distance hd-1.
	            if (temp.left != null)
	            {
	                temp.left.hd = hd-1;
	                queue.add(temp.left);
	            }
	            // If the dequeued node has a left child add it to the
	            // queue with a horizontal distance hd+1.
	            if (temp.right != null)
	            {
	                temp.right.hd = hd+1;
	                queue.add(temp.right);
	            }
	        }
	 
	        /*// Extract the entries of map into a set to traverse
	        // an iterator over that.
	        Set<Entry<Integer, Integer>> set = map.entrySet();
	 
	        // Make an iterator
	        Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	 
	        // Traverse the map elements using the iterator.
	        while (iterator.hasNext())
	        {
	            Map.Entry<Integer, Integer> me = iterator.next();
	            System.out.print(me.getValue()+" ");
	        }*/
	        
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	        	System.out.println(entry.getValue());
	        }
	    }
	
	 
	// Main driver class
	
	    public static void main(String[] args)
	    {
	    	BottomView tree = new BottomView();
	    	tree.root = new TreeNode(20);
	    	
	    	tree.root.left = new TreeNode(8);
	    	tree.root.right = new TreeNode(22);
	    	tree.root.left.left = new TreeNode(5);
	    	tree.root.left.right = new TreeNode(3);
	    	tree.root.right.left = new TreeNode(4);
	    	tree.root.right.right = new TreeNode(25);
	    	tree.root.left.right.left = new TreeNode(10);
	    	tree.root.left.right.right = new TreeNode(14);
	        
	        System.out.println("Bottom view of the given binary tree:");
	        tree.bottomView();
	    }
}

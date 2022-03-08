
package com.sv.linkedlist;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-03-07
 * purpose: 
 */
public class Node {
    
    private String data;
    private Node next;
    
    public Node(String data) {
        this.data = data;
        this.next = null;
    }
    
    public void setNextNode(Node node) {
        this.next = node;
    }
    
    

}


package com.sv.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-03-07
 * purpose: 
 */
public class LinkedList {
    
    private class Node {
        private String data;
        private Node next;
        
        private Node(String data) {
            this.data = data;
        }
    }
    
    private Node first;
    private Node last;
    
    
    public void addFirst(String data) {
        var node = new Node(data);
        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
            
        }
    }
    
}

/*
---------------------------------------------------------------------------------------------------------
documentation:
this is a link list implementing nodes to create a linked list that acts like a stack
implemented defensive design.
---------------------------------------------------------------------------------------------------------
 */


import java.util.*;

public class MyStackDD {
    //used to count everything in the stack
    //so if the stack is popped, the count de-increments
    //if the stack is pushed, the count increments
    private int count = 0;
    //Node newNode = new Node();
    //newNode.data = element;


    private Node first;       //node for the first of the stack
    private Node current;     //node for peek


    public MyStackDD(){       //constructor for an empty stack
        first = null;
    }

    //used to push a new element to the top of the stack
    public void push(int element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        try {
            //if more than five elements, the stack will overflow
            if (count > 4) {
                isFull();
                throw new NoSuchElementException("stack too big");
            }else{
                count++;
            }
        }
        catch(NoSuchElementException e){
            System.out.println("list is too big.");
        }
        current = first;
    }

    public int pop() {          //removes element from the top of the stack
        //throw exception when there is nothing to pop to keep program from crashing
        try {
            if (count == 0) {
                isEmpty();
                throw new NoSuchElementException("there is nothing to pop");
            } else {
                //else remove one element and return element beneath that one
                count = count -1;
                int element = first.data;
                first = first.next;
                current = first;
                return element;
            }
        }
        catch(NoSuchElementException e){
            System.out.println("There is nothing to pop");
        }
        current = first;
        return 0;
    }

    //if this is full it will return a boolean to tell the user that it is full
    public boolean isFull(){
        if (count == 4){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() { //if the stack is empty, return true
        return first == null;
    }

    //use this to save nodes
    //defensive design by limited scope as well as making everything private
    private class Node {

        private int data;
        private Node next;
    }

    public void peek(){
        //display the current node
        System.out.println(current.data);
    }
}
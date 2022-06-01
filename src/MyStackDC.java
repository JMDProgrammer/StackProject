/*
---------------------------------------------------------------------------------------------------------
documentation:
this is a link list using the java implemented LinkedList, design by contract
---------------------------------------------------------------------------------------------------------
 */
import java.util.*;


public class MyStackDC {

    //Linked list to store Integer objects
    LinkedList<Integer> MyList;

    //constructor for the stack
    public MyStackDC(){
       MyList = new LinkedList<Integer>();
    }

    //push a new element onto the stack
    public void push(int element){
        MyList.addLast(element);
    }

    //removes the last element on the linked list
    public int pop() {
       return MyList.removeLast();
    }
    //add new element at the end

    public int peek(){
        return MyList.getLast();
    }

    //check if the linked list is empty
    //if linked list is empty return 0
    //don't really need this because of how the main is implemented
    public boolean isEmpty(){
        return MyList.size() == 0;
    }
    //check if the linked list is full
    //if it is full, list will return 4
    public boolean isFull(int max){
       return MyList.size() == max;
    }
}

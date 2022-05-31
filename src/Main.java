public class Main {
    public static void main(String[] args) {



            //used for the user to determine size of the stack
            int max = 4;
            //created new object for the design by contract class
            MyStackDC2 myStackDC2 = new MyStackDC2();

            //start while loop to do automate stacks
            for(int i = 0; i<max; i++)
                {
                    //if statements for the main to determine whether the user wants to
                    // pop or push the stack
                    //for the user to check if the stack is not full
                    if (!myStackDC2.isFull(max)) {
                        //stack will be able to push
                        //push this stack
                        myStackDC2.push(1);
                        myStackDC2.push(2);
                        //System.out.println("the stack has pushed");
                        // -----------------------------------------------
                        //for the user to check if the stack is not empty
                    } else if (!myStackDC2.isEmpty()) {
                        //stack will be able to pop
                        System.out.println(myStackDC2.peek());
                        myStackDC2.pop();
                        // -----------------------------------------------
                        //for the user to check if the stack is full
                    } else if (myStackDC2.isFull(max)) {
                        //stack will not be able to push
                        System.out.println("the stack is full");
                        // -----------------------------------------------
                        //for the user to check if the stack is empty
                    } else if (myStackDC2.isEmpty()) {
                        //stack will not be able to pop
                        System.out.println("The stack is empty");
                    }//end last if else statement
                }//end for loop


        

    /*
        MyStackDD stackDD = new MyStackDD();
        stackDD.pop();
        stackDD.push(1);
        System.out.println();
        stackDD.push(2);
        stackDD.push(3);
        stackDD.push(4);
        stackDD.push(5);
      */


        }
    }

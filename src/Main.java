public class Main {
    public static void main(String[] args) {


//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------START MAIN FOR DESIGN BY CONTRACT-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////
            //used for the user to determine size of the stack
            int max = 4;
            //created new object for the design by contract class
            MyStackDC2 myStackDC = new MyStackDC2();

            //start while loop to do automate stacks for user
            for(int i = 0; i<max; i++)
                {
                    //if statements for the main to determine whether the user wants to
                    // pop or push the stack
                    //for the user to check if the stack is not full
                    if (!myStackDC.isFull(max)) {
                        //stack will be able to push
                        //push this stack
                        myStackDC.push(i);
                        myStackDC.push(2);
                        //System.out.println("the stack has pushed");
                        // -----------------------------------------------
                        //for the user to check if the stack is not empty
                    } else if (!myStackDC.isEmpty()) {
                        //stack will be able to pop
                        System.out.println(myStackDC.peek());
                        myStackDC.pop();
                        // -----------------------------------------------
                        //for the user to check if the stack is full
                    } else if (myStackDC.isFull(max)) {
                        //stack will not be able to push
                        System.out.println("the stack is full");
                        // -----------------------------------------------
                        //for the user to check if the stack is empty
                    } else if (myStackDC.isEmpty()) {
                        //stack will not be able to pop
                        System.out.println("The stack is empty");
                    }//end last if else statement
                }//end for loop
//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------END MAIN FOR DESIGN BY CONTRACT-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////





//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------START MAIN FOR DESIGN BY DEFENSE-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////

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

//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------END MAIN FOR DESIGN BY DEFENSE-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////


    


        }//end main method
    }//end main class

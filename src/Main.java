/*
---------------------------------------------------------------------------------------------------------
documentation:
the controller that enables use for the mystackdc and mystackdd classes
---------------------------------------------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {


//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------START MAIN FOR DESIGN BY CONTRACT-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////
            //used for the user to determine size of the stack
            int max = 4;
            //created new object for the design by contract class
            MyStackDC myStackDC = new MyStackDC();

            //start while loop to automate stacks for user
            for(int i = 0; i<max; i++)
                {
                    //if statements for the main to determine whether the user wants to
                    // pop or push the stack
                    //for the user to check if the stack is not full
                    if (!myStackDC.isFull(max)) {
                        //stack will be able to push
                        //push this stack
                        myStackDC.push(i);
                        //System.out.println("the stack has pushed");
                        // -----------------------------------------------
                        //for the user to check if the stack is not empty
                    } else if (!myStackDC.isEmpty()) {
                        //stack will be able to pop
                        //check what is on top of the stack
                        //System.out.println(myStackDC.peek());
                        myStackDC.peek();
                        //pop the stack
                        myStackDC.pop();
                        // -----------------------------------------------
                        //for the user to check if the stack is full
                    } else if (myStackDC.isFull(max)) {
                        //stack will not be able to push, do nothing
                        //System.out.println("the stack is full");
                        // -----------------------------------------------
                        //for the user to check if the stack is empty
                    } else if (myStackDC.isEmpty()) {
                        //stack will not be able to pop, do nothing
                        //System.out.println("The stack is empty");
                    }//end last if else statement
                }//end for loop

        //----------------------------------------------------------------------------
        // if the user does not an automated stack then he can just use if methods
        //----------------------------------------------------------------------------

            //if statements for the main to determine whether the user wants to
            // pop or push the stack
            //for the user to check if the stack is not full

            //checks if the stack is not full, if it is not full push.
            if (!myStackDC.isFull(max)) {

                //-------------------------------------
                //place your push integers here
                //exe:
                myStackDC.push(1);
                //-------------------------------------

                //for the user to check if the stack is not empty
            } if (!myStackDC.isEmpty()) {

                //stack will be able to pop
                //-------------------------------------
                //place your pop integers here
                //exe:
                myStackDC.pop();
                //-------------------------------------
                //check what is on top of the stack
                myStackDC.peek();
                // -----------------------------------------------

                //for the user to check if the stack is full
            } if (myStackDC.isFull(max)) {
                //stack will not be able to push, do nothing
                System.out.println("the stack is full");
                // -----------------------------------------------
                //for the user to check if the stack is empty
            } if (myStackDC.isEmpty()) {
                //stack will not be able to pop, do nothing
                System.out.println("The stack is empty");
            }//last if statement

//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------END MAIN FOR DESIGN BY CONTRACT-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////





//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------START MAIN FOR DESIGN BY DEFENSE-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////


        //create new object
        MyStackDD stackDD = new MyStackDD();
        //pop stack
        stackDD.pop();
        //push stacks 1-5
        stackDD.push(1);
        stackDD.push(2);
        stackDD.push(3);
        stackDD.push(4);
        stackDD.push(5);
        //check the top of the stack
        stackDD.peek();
        //remove and replace top of stack
        stackDD.pop();
        //check the top of the stack
        stackDD.peek();

//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------END MAIN FOR DESIGN BY DEFENSE-----------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////
        }//end main method
    }//end main class

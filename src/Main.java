public class Main {
    public static void main(String[] args) {



            //used for the user to determine size
            int max = 4;
            MyStackDC2 myStackDC2 = new MyStackDC2();


            //for the user to check if the stack is not full
            if (!myStackDC2.isFull(max)) {
                //stack will be able to push
                myStackDC2.push(1);
                //System.out.println("the stack has pushed");
                //for the user to check if the stack is not empty
            } if (!myStackDC2.isEmpty()) {
                //stack will be able to pop
                System.out.println(myStackDC2.peek());
                myStackDC2.pop();
                //for the user to check if the stack is full
            } if (myStackDC2.isFull(max)) {
                //stack will not be able to push
                System.out.println("the stack is empty");
                //for the user to check if the stack is empty
            } if (myStackDC2.isEmpty()) {
                //stack will not be able to pop
                System.out.println("The stack is empty");
            }
            

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

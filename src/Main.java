public class Main {
<<<<<<< Updated upstream
    public static void main(String[] args) {

        //testing intellij ide
        System.out.println("Hello world!");
        int test = 1;
        int test2 =2;
        int test3 = test + test2;
        System.out.println(test3);

        //testing interfaces and other things
        testStack A = new testStack();
        A.share();
        System.out.println(testStack.a);

        //testing class connection to interface within the main class
        System.out.println(testClass(testStack.a));

        //testing colors
        for(int i =0; 10 >= i ; i++){
            if(i==5) {
                System.out.println("blue brackets ");
                System.out.println(".");
                for(int j =0; 10>= j; j++){
                    if(j==5 || j==4 ){
                        System.out.print("yellow brackets ");
                        }
                        else {
                        System.out.println("yellow else brackets");
                        do {
                            System.out.println("do it");
                           break;
                        } while (i == 5); {
                            System.out.println("loop again green brackets");
                            i++;
                        }
                    }
                }
            }
        }
    }

    public static int testClass(int fun){
    return fun;
=======

    public static void main(String[] args) { //caller

        //used for the user to determine size
        int max =4;
        MyStackDC2 myStackDC2 = new MyStackDC2();




        //for the user to check if the stack is not full
        if(!myStackDC2.isFull(max)) {
            //stack will be able to push
            myStackDC2.push(1);
            System.out.println("the stack is full");
            //for the user to check if the stack is empty

            //for the user to check if the stack is not empty
        }else if(!myStackDC2.isEmpty()){
            //stack will be able to pop
            System.out.println(myStackDC2.peek());
            myStackDC2.pop();
        }else if(myStackDC2.isFull(max)){
            //stack will not be able to push
            System.out.println("the stack is empty");
        //for the user to check if the stack is empty
        } else if(myStackDC2.isEmpty()) {
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

>>>>>>> Stashed changes
    }
}
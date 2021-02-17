package fundamentals7;

import java.nio.file.Path;

public class MoreLoopsPractice {

    public static void main(String[] args) {

    int number = 100;
    String[] countries = {"Spain", "Italy", "Holland", "Denmark"};
    //for loop

    for (int i = 0; i<10; i++ ){
        //do stuff here
        //initialize / boolean expression / increment
    }

    //for each loops

        for(String country : countries){
            //do stuff
        }
        // variable: collection


     //while loop

//     while(countries){
//         //while the condition is true, do this
//     }
    // while boolean expression  - can use continue; and break; keywords here
     //do while loop

    do{
        System.out.println(countries.toString());
    } while (number > 100);
}
}

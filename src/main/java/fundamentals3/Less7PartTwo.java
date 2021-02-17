package fundamentals3;

public class Less7PartTwo {

    public static void main(String[] args) {

        int a = 2;
        int b = 8;
        int c = 7;

        if (a > b && a > c){
            System.out.println("a is the highest");
        } if (b > a && b > c){
            System.out.println("b is the highest");
        } if (c > a && c > b){
            System.out.println("c is the highest");
        } else {
            System.out.println("2 or more of them are equal!");
        }

        }

}

//with else - if all the above statements are false, it will print the else statement

//check which number is the highest using else if/else/ if statements

//if you have an if statement, it will check the next condition even if it's true?!
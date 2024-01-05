import java.util.Scanner;

public class quiz {
    int userScore = 0;
    Scanner scan = new Scanner(System.in);
    Scanner scann = new Scanner(System.in);

    public void difficulty() {
        System.out.println("choose diffficulty");
        System.out.println("1.Easy | 2.Normal | 3.Hard");

        int difficulty = scan.nextInt();
        if (difficulty == 1) {
            diff_Easy();
        } else if (difficulty == 2) {
            diff_Noraml();
        } else {
            diff_Hard();
        }
    }

    public void diff_Easy() {

        System.out.println(" \t Level-1");
        System.out.println("Q1--How may days are present in a leap Year?");
        int ans1 = 366;
        int userans = scan.nextInt();
        if (userans == ans1) {
            System.out.println("Your Answer is Correct  " + ans1);
            userScore++;
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Largest_and_heaviest_animals");

        } else {
            System.out.println("The Correct answer is :  " + ans1);
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Leap_year ");
        }
        System.out.println("\n Q--2  What is the largest mammal on Earth?");
        String ans2 = "blue whale";

        String userans2 = scann.nextLine();

        if (userans2.equals(ans2)) {
            System.out.println("Your Answer is Correct  " + ans2);
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Largest_and_heaviest_animals");
            userScore++;

        } else {
            System.out.println("The Correct answer is :  " + ans2);
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Largest_and_heaviest_animals");
        }
        System.out.println("\n Q3-- Which fruit is red and has seeds outside?");
        System.out.println("1.Strawberry | 2.Apple | 3 .Guva ");
        int userans3 = scan.nextInt();
        if (userans3 == 1) {
            System.out.println("Your Answer is Correct  Strawberry");
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Strawberry ");
            userScore++;
        } else {
            System.out.println("The Correct answer is : Strawberry");
            System.out.println("Click Here to Know More: https://en.wikipedia.org/wiki/Strawberry ");
        }
        System.out.println("\n \t Congratulations!! Your Score is : " + userScore + "/3");
        System.out.println("Continue Your  Quiz ?(Y-yes |N- no )");
        String ans3 = scann.nextLine();
        if (ans3.equals("Y")) {
            System.out.println(" \n  \t  welcome to Level 2");
            diff_Noraml();
        } else {
            System.out.println("THANK YOU!!");
        }
    }

    public void diff_Noraml() {
        userScore = 0;
        System.out.println(" \n Q--1 What do we use to navigate and find directions? ");
        String ans1 = "compass";
        String user_ans1 = scann.nextLine();
        if (user_ans1.equals(ans1)) {
            System.out.println("Your Answer is Correct " + ans1);
            userScore++;
        } else {
            System.out.println("The Correct answer is :  compass");
        }
        System.out.println(" \n Q--2 What do we use to measure temperature?  ");
        System.out.println("1.thermometer | 2.stethoscope");
        int user_ans2 = scan.nextInt();
        if (user_ans2 == 1) {
            System.out.println("Your Answer is Correct: thermometer ");
            userScore++;
        } else {
            System.out.println("The Correct answer is : thermometer  ");
        }
        System.out.println(" \n Q--3  Which animal can change the color of its skin to match its surroundings?  ");
        System.out.println("1.Snake | 2.Chameleon | 3.snake | 4.parrot");
        int user_ans3 = scan.nextInt();
        if (user_ans3 == 2) {
            System.out.println("Your Answer is Correct: Chameleon ");
            System.out.println("Click Here to Know More:  https://en.wikipedia.org/wiki/Chameleon ");
            userScore++;
        } else {
            System.out.println("The Correct answer is : Chameleon  ");
            System.out.println("Click Here to Know More:  https://en.wikipedia.org/wiki/Chameleon ");
        }
        System.out.println("\n \t Congratulations!! Your Score is : " + userScore + "/3");
        System.out.println("Continue Your  Quiz ?(Y-yes |N- no )");
        String ans3 = scann.nextLine();
        if (ans3.equals("Y")) {
            System.out.println(" \n  \t  welcome to Level 3");
            diff_Hard();
        } else {
            System.out.println("THANK YOU!!");
        }

    }

    public void diff_Hard() {
        userScore = 0;
        System.out.println("\n Q1--What is the name of the oldest lake in the world?");
        System.out.println("1.Lake Baikal | 2.Sudarshan Lake | 3.Dal Lake ");
        int ans1 = scan.nextInt();
        if (ans1 == 1) {
            System.out.println("Your Answer is Correct: Lake baikal ");
            System.out.println(
                    "Click Here to Know More:https://en.wikipedia.org/wiki/Ancient_lake#:~:text=Lake%20Baikal%20is%20often%20considered,25%E2%80%9330%20million%20years%20old. ");
            userScore++;
        } else {
            System.out.println("The Correct answer is :  Lake baikal  ");
            System.out.println(
                    "Click Here to Know More:https://en.wikipedia.org/wiki/Ancient_lake#:~:text=Lake%20Baikal%20is%20often%20considered,25%E2%80%9330%20million%20years%20old. ");
        }
        System.out.println("\n Q2--E=mc² is Einstein’s famous formula for what theory?");
        System.out.println("1. Cosmology | 2.Field theory | 3.Theory of Relativity");
        int ans2 = scan.nextInt();
        if (ans2 == 3) {
            System.out.println("Your Answer is Correct: Theory of Relativity  ");
            System.out.println(
                    "Click Here to Know More:https://www.amnh.org/exhibitions/einstein/energy#:~:text=The%20most%20famous%20equation%20in,the%20Special%20Theory%20of%20Relativity.  ");
            userScore++;
        } else {
            System.out.println("The Correct answer is : Theory of Relativity   ");
            System.out.println(
                    "Click Here to Know More: https://www.amnh.org/exhibitions/einstein/energy#:~:text=The%20most%20famous%20equation%20in,the%20Special%20Theory%20of%20Relativity. ");
        }
        System.out.println("\n Q3--Which ocean has more coastline on it? ");
        System.out.println("1. Pacific | 2.Atlantic");
        int ans3 = scan.nextInt();
        if (ans3 == 1) {
            System.out.println("Your Answer is Correct: Pacific ");
            userScore++;
        } else {
            System.out.println("The Correct answer is :  Pacific  ");

        }
        System.out.println("\n \t Congratulations!! Your Score is : " + userScore + "/3");
        System.out.println("\n Play Again?");
        System.out.println("1.Yes | 2.No");
        int userop = scan.nextInt();
        if (userop == 1) {
            difficulty();
        } else {
            System.out.println("THANK YOU!!");
        }
    }

    public static void main(String[] args) {
        quiz q = new quiz();
        q.difficulty();

    }

}

import java.util.Scanner;

public class App {
    public static void main(String [] args) {

        String q1 = "What color is patrick?\n"
                  + "(a)pink\n(b)Orange\n(c)Magenta\n";

        String q2 = "What color are Stop signs?\n"
                  + "(a)red\n(b)Yellow\n(c)Blue\n";

        String q3 = "Is Pluto a planet?\n"
                  + "(a)yes\n(b)no\n(c)Magenta\n";

        String q4 = "Were Dinosaurs real?\n"
                  + "(a)yes\n(b)no\n(c)nah\n";

        String q5 = "Did dragons exist?\n"
                  + "(a)yes\n(b)hell yeah\n(c)nope\n";

        String q6 = "Are Dodo's extinct?\n"
                  + "(a)nope\n(b)hell nah\n(c)yep\n";

        String q7 = "Is milk bad for the bones?\n"
                  + "(a)yes\n(b)nope\n(c)aquamarine\n";

        String q8 = "Will Elon musk take us to mars?\n"
                  + "(a)ye\n(b)DON'T DISRESPECT OUR LORD ELON\n(c)nah b\n";

        String q9 = "Is McDonalds healthy?\n"
                  + "(a)yes\n(b)nah\n(c):)\n";

        String q10 = "Should you vaccinate your child\n"
                   + "(a)hell nah\n(b)of course\n(c)the lord protects my child\n";


        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "a"),
                new Question(q3, "b"),
                new Question(q4, "a"),
                new Question(q5, "c"),
                new Question(q6, "c"),
                new Question(q7, "b"),
                new Question(q8, "b"),
                new Question(q9, "b"),
                new Question(q10, "b")
        };
        takeTest(questions);
    }
    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
        System.out.println("Right answers: 1a, 2a, 3b, 4a, 5c, 6c, 7b, 8b, 9b, 10b");
    }



}


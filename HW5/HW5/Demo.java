import java.util.Scanner;
public class Demo extends data
{

    public static void main(String[] args)
    {
        int correct = 0;
        String answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the quiz! ");
        System.out.println("\nLevel 1: ");
        int level = 1;
        level1 question = new level1();
        while (correct < 5) 
        {
            int[] randomNums = randomizer(level);
            question.getNums(randomNums[0],randomNums[1],randomNums[2]);
            System.out.print(question);
            answer = input.nextLine();
            if (question.checkAnswer(answer) == true)
            {
                System.out.println("Correct!");
                correct ++;
            } 
            else 
            {
                System.out.println("Wrong, you have 1 more try");
                answer = input.nextLine();
                if (question.checkAnswer(answer) == true)
                {
                    System.out.println("Correct!");
                    correct ++;
                } 
                else 
                {
                    System.out.println("Going to next question");
                }
                
            }
        }
        
        
        System.out.println("\n\nLevel 2: ");
        level++;
        correct = 0;
        level2 question2 = new level2();
        while (correct < 5) 
        {
            int[] randomNums = randomizer(level);
            question2.getNums(randomNums[0],randomNums[1],randomNums[2]);
            System.out.print(question2);
            answer = input.nextLine();
            if (question2.checkAnswer(answer) == true)
            {
                System.out.println("Correct!");
                correct ++;
            } 
            else 
            {
                System.out.println("Wrong, you have 1 more try");
                answer = input.nextLine();
                if (question2.checkAnswer(answer) == true)
                {
                    System.out.println("Correct!");
                    correct ++;
                } 
                else 
                {
                    System.out.println("Going to next question");
                }
                
            }
        } 
        
        System.out.println("\n\nLevel 3: ");
        level++;
        correct = 0;
        level3 question3 = new level3();
        while (correct < 5) 
        {
            int[] randomNums = randomizer(level);
            question3.getNums(randomNums[0],randomNums[1],randomNums[2]);
            System.out.print(question3);
            answer = input.nextLine();
            if (question3.checkAnswer(answer) == true)
            {
                System.out.println("Correct!");
                correct ++;
            } 
            else 
            {
                System.out.println("Wrong, you have 1 more try");
                answer = input.nextLine();
                if (question3.checkAnswer(answer) == true)
                {
                    System.out.println("Correct!");
                    correct ++;
                } 
                else 
                {
                    System.out.println("Going to next question");
                }
                
            }
        }
        System.out.println("You have completed all of the levels!");
    }

}

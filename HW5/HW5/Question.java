
public class Question
{
    public int questionNumber=1, guessAnswer, num1, num2;
    public String answer;
    public Question()
    {
       num1 = 0;
       num2 = 0;

    }
    public void getNums(int firstNum, int secondNum, int rAnswer) 
    {
        num1 = firstNum;
        num2 = secondNum;
        answer = String.valueOf(rAnswer);
    }
    
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }
    
    public String toString() 
    {
        return "What is " + num1 + " + " + num2 + "? \n";
    }
}

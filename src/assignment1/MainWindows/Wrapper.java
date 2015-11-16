/**
 * This file might contain any mistake as it's made by Ahmed Hamdy (student), if you find any mistake please report it to me :) thanks!
 */
package assignment1.MainWindows;

/**
 *
 * @author Ahmed
 */
public class Wrapper
{

    public String questionType;
    public String question;
    public String answer;
    public boolean isAnswer;
    private static int questionCount = 0;

    public int getQuestionCount()
    {
        return questionCount;
    }

    public Wrapper()
    {
        questionCount++;
    }
}

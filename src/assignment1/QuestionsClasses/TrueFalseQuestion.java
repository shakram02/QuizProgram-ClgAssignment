/**
 * This file might contain any mistake as it's made by Ahmed Hamdy (student), if you find any mistake please report it to me :) thanks!
 */
package assignment1.QuestionsClasses;

import assignment1.MainWindows.AppManager;

/**
 *
 * @author Ahmed
 */
public class TrueFalseQuestion extends Question
{

    @Override
    public boolean checkAnswer(Object answer)
    {
        //boolean ans = (boolean) answer;
        String ans = (boolean) answer ? "True" : "False";
        //System.out.println("Implement the CheckAnswerMethod - TFQ");
        return ans.equalsIgnoreCase(AppManager.currentQuestion.answer);
    }

}

/**
 * This file might contain any mistake as it's made by Ahmed Hamdy (student), if you find any mistake please report it to me :) thanks!
 */
package assignment1.QuestionsClasses;

import assignment1.MainWindows.AppManager;

/**
 *
 * @author Ahmed
 */
public class LongAnswerQuestion extends Question
{

    @Override
    public boolean checkAnswer(Object answer)
    {
        // Check the answer
        return ((String) answer).equalsIgnoreCase(AppManager.currentQuestion.answer);
    }
}

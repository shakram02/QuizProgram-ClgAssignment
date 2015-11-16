/**
 * This file might contain any mistake as it's made by Ahmed Hamdy (student), if you find any mistake please report it to me :) thanks!
 */
package assignment1.MainWindows;

import java.util.LinkedList;

/**
 *
 * @author Ahmed
 */
public class AppManager
{

    // Stirngs to be writeen in file
    public static LinkedList<String> DataCollection = new LinkedList<String>();

    // Question type to create objects when saving the file
    public static int questionType;

    // User type, to know whether to check / save the answers
    public static boolean isAdmin = false;

    // Temp question acts like a place holder
    public static Wrapper currentQuestion;

    // Question counter that is global for the application
    public static int currentQuestionIndex = 0;

    // Student Name to display in the quiz grade
    public static String studentName;

    // Total number of questions
    public static int questionCount;

    // Number of questions student encountered
    public static int answeredQuestionsCount;

    // Collection of the avaiable questions
    @SuppressWarnings(
            {
                "FieldMayBeFinal", "Convert2Diamond"
            })
    private static LinkedList<Wrapper> questionCollection = new LinkedList<Wrapper>();

    public static void writeToFlie(String Type, String Question, String Answer, boolean isAnswer)
    {
        // Debug statement
        System.out.println("Added to the DataCollection:\n" + Type + "," + Question + "," + Answer);

        DataCollection.add((Type + "," + Question + "," + Answer));
    }

    // Overload method to perfom the actual file writing
    public static void writeToFile()
    {
        // Write the data to the file
        if (DataCollection.size() > 0)
        {
            System.out.println("Wrote to file" + DataCollection.get(0));
            FileManager.flushFile();

            // Delete the contents of the collection
            DataCollection.removeAll(DataCollection);
        }

    }

    public static void readOneLineFromFile() throws RuntimeException
    {
        // TODO: read 1 line of the file
        LinkedList<String> stringsOfFile = FileManager.readFromFile();

        // Each line contains, type, question, answer
        if (stringsOfFile == null)
        {
            System.out.println("Line read from file is null");
            throw new RuntimeException("File doesn't exist");
        }

        System.out.println("This list has " + stringsOfFile.size() + " strings");
        for (int i = 0; i < stringsOfFile.size() - 1;)
        {
            Wrapper current = new Wrapper();

            // Put the linked list to the wrapper class consecutively
            current.questionType = stringsOfFile.get(i++);
            current.question = stringsOfFile.get(i++);
            current.answer = stringsOfFile.get(i++);

            // Add this question to the question collection
            questionCollection.add(current);
        }

        // Load the first question
        currentQuestion = questionCollection.get(currentQuestionIndex);

        // Update the question count
        questionCount = questionCollection.size();

        // Parse the line
        System.out.println("Finished parsing file");
    }

    public static boolean LoadNextQuestion()
    {
        // Increment the question counter
        currentQuestionIndex++;
        if (currentQuestionIndex < questionCollection.size())
        {
            currentQuestion = questionCollection.get(currentQuestionIndex);
            return true;
        }
        return false;
    }

    private AppManager()
    {
    }

}

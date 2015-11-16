/**
 * This file might contain any mistake as it's made by Ahmed Hamdy (student), if you find any mistake please report it to me :) thanks!
 */
package assignment1.MainWindows;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class FileManager
{

    private static final String fileName = "Data.txt";

    private FileManager()
    {
    }

    public static void flushFile()
    {
        try
        {
            PrintStream fileStream;
            fileStream = new PrintStream(new File(fileName));

            int entryCount = AppManager.DataCollection.size();
            System.out.println("Writing " + entryCount + " entries");

            // Print each line of data in the LinkedList
            for (int i = 0; i < entryCount; i++)
            {
                // Write the entry
                String entry = AppManager.DataCollection.get(i);

                // Print each entry on a separate line
                //System.out.println("Currently Writing:" + entry);
                fileStream.println(entry);

            }
            System.out.println("Done writing");
        }

        catch (IOException ex)
        {
            System.out.println("Error writing to file '" + fileName + " \n" + ex.getMessage());
        }
        //File f = new File (fileName);
        //Scanner s1 = new Scanenr(f)
    }

    public static LinkedList<String> readFromFile()
    {
        File f;
        Scanner scanner;
        LinkedList<String> result = new LinkedList<>();

        try
        {
            f = new File(fileName);
            scanner = new Scanner(f);
            //Pattern regex = Pattern.compile("\\w");

            while (scanner.hasNext())
            {
                String current = scanner.next();
                String[] splitLine = current.split(",");

                for (int i = 0; i < splitLine.length; i++)
                {
                    // Debug statement
                    System.out.println("Scanner adding to list:" + splitLine[i]);
                    result.add(splitLine[i]);
                }

                System.out.println("Scanner reading:" + current);
                //result.add(current);
                //System.out.println("Output of file" + );                
            }

            return result;
        }
        catch (IOException exc)
        {
            System.out.println("Error reading file line" + exc.getMessage());
        }
        return null;
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabyName
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int total_babys = 0;
        Scanner file = new Scanner(new File("babynames.txt"));
        // Creates 2 output files
        PrintWriter boynames = new PrintWriter("boynames.txt");
        PrintWriter girlnames = new PrintWriter("girlnames.txt");
        //putting the correct names in the correct files
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            String[] wordsplit = line.split("[ ]+");
            boynames.println(wordsplit[1]);
            girlnames.println(wordsplit[4]);
            int i = Integer.parseInt(wordsplit[2]);
            int j = Integer.parseInt(wordsplit[5]);
            total_babys = total_babys + i + j;
        }
        System.out.println("The total number of babies born is "+ total_babys);
        
        file.close();
        boynames.close();
        girlnames.close();

    }
}

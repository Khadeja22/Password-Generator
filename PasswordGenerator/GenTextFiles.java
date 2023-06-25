package passwordgenerator;

//import java.util.*;
import java.io.*;

public class GenTextFiles {

    public static void GenLowerCase()  throws IOException
  {
    //CREATE FILES

    //lowercase
    File lower = new File("Lower.txt");
    PrintWriter outFile1 = new PrintWriter(lower);
    
    for (int i = 0; i < 1000; i++)
      {
        int num1 = (int)(Math.random()*25)+97;
        
        outFile1.println(num1);
      }
    outFile1.close();
  }

    //Upper.txt- 1000 random ints representing the ASCII value for uppercase letters! :-)
    public static void GenUpperCase() throws IOException
    {
      File upper =new File("Upper.txt");
      PrintWriter outFile2 = new PrintWriter(upper);
      
      for (int i = 0; i < 1000; i++)
        {
          int num2 = (int)(Math.random()*25)+65;
          
          outFile2.println(num2);
        }
      outFile2.close();
    }

    //Mixed_letters.txt - 1000 random int's representng the ASCII values for uppercase and lowercase letters
    public static void GenMixedLetters()  throws IOException
    {
      File mixed_letters =new File("Mixed_letters.txt");
      PrintWriter outFile3 = new PrintWriter(mixed_letters);
      
      for (int i = 0; i < 1000; i++)
        {
          int random = (int) (Math.random()*2);
          if (random == 0)
          {
          int num3 = (int)(Math.random()*25)+65;
          
          outFile3.println(num3);
          }
          else
          {
          int num3 = (int)(Math.random()*25)+97;
          
          outFile3.println(num3);
          }
        }
      outFile3.close();
    } 

  public static void GenMixedLettersNumbers()  throws IOException
  {
    //Mixed_letters_numbers.txt - 1000 rando m
    File mixed_letters_numbers =new File("Mixed_letters_numbers.txt");
    PrintWriter outFile4 = new PrintWriter(mixed_letters_numbers);
    
    for (int i = 0; i < 1000; i++)
      {
        int random = (int) (Math.random()*3);
        if (random == 0)//capital letters
        {
          int num4 = (int)(Math.random()*25)+65;
          
          outFile4.println(num4);
        }
        else if (random == 1)//lowercase letters
        {
          int num4 = (int)(Math.random()*25)+97;
          
          outFile4.println(num4);
        }
        else //numbers
        {
          int num4 = (int)(Math.random()*9)+48;
          
          outFile4.println(num4);
        }
      }
    outFile4.close();
  }

  public static void GenMixedChar()  throws IOException
  {
    //Mixed_chars.txt  includes every .character on the ASCII Reference           Document except the space found at character 32
  
    File mixed_chars =new File ("Mixed_chars.txt");
    PrintWriter outFile5 = new PrintWriter(mixed_chars);
    
    for (int i = 0; i < 1000; i++)
      {

        int random = (int) (Math.random()*2);
          if (random == 0)
          {
            int num5 = (int)(Math.random()*95)+33;
            outFile5.println(num5);
          }
          else
          {
            int num5 = (int)(Math.random()*32)+0;
            outFile5.println(num5);
          }
        
      }
    outFile5.close();
  }

}

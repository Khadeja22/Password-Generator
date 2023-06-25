package passwordgenerator;
import java.util.*;
import java.io.*;

class PasswordGen 
{
  public static void main(String[] args) throws IOException 
  {

    GenTextFiles.GenLowerCase();
    GenTextFiles.GenUpperCase();
    GenTextFiles.GenMixedLetters();
    GenTextFiles.GenMixedLettersNumbers();
    GenTextFiles.GenMixedChar();

    int[] lowARR = new int[1000];
    int[] upperARR = new int[1000];
    int[] mixedARR = new int[1000];
    int[] mixed_letters_numbersARR = new int[1000];
    int[] mixed_charsARR = new int[1000];

    char[] clowARR = new char[1000];
    char[] cupperARR = new char[1000];
    char[] cmixedARR = new char[1000];
    char[] cmixed_letters_numbersARR = new char[1000];
    char[] cmixed_charsARR = new char[1000];



    ReadLower(lowARR);
    for (int i=0; i<lowARR.length; i++)
    {
      clowARR[i]=(char)lowARR[i];
    }

    ReadUpper(upperARR);
    for (int i=0; i<upperARR.length; i++)
    {
      cupperARR[i]=(char)upperARR[i];
    }

    ReadMixedLetter(mixedARR);
    for (int i=0; i<mixedARR.length; i++)
    {
      cmixedARR[i]=(char)mixedARR[i];
    }

    ReadMixedLetterNumber(mixed_letters_numbersARR);
    for (int i=0; i<mixed_letters_numbersARR.length; i++)
    {
      cmixed_letters_numbersARR[i]=(char)mixed_letters_numbersARR[i];
    }

    ReadMixedChar(mixed_charsARR);
    for (int i=0; i<mixed_charsARR.length; i++)
    {
      cmixed_charsARR[i]=(char)mixed_charsARR[i];
    }

    
    System.out.println("Do you wish to continue? 0 to exit and other numbers to continue");

    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;

    int choice;
    while(true){
        System.out.println("Password Main Menu\n");
        System.out.print("1.) Lowercase letters \n");
        System.out.print("2.) Uppercase letters.\n");
        System.out.print("3.) Uppercase and Lowercase letters.\n");
        System.out.print("4.) Uppercase, Lowercase, and Numbers.\n");
        System.out.print("5.) Uppercase, Lowercase, Numbers and Symbols.\n");
        System.out.print("0.) Exit\n");
        System.out.print("\nEnter Your Menu Choice: ");

        choice = input.nextInt();
        switch(choice){
          case 1: 
          
                File lower2 = new File("Lowerpw.txt");
                PrintWriter outFile11 = new PrintWriter(lower2);
                
                for (int i=0; i<clowARR.length; i++)
                {
                
                  outFile11.print(clowARR[i]);
                  if ((i+1)%8==0 && i>0)
                  {
                  
                    outFile11.println();
                  
                  }
                }
                
                outFile11.close();
                  break;
          case 2:

                File upper2 = new File("Upperpw.txt");
                PrintWriter outFile22 = new PrintWriter(upper2);
               
                for (int i=0; i<cupperARR.length; i++)
                {
                
                  outFile22.print(cupperARR[i]);
                  if ((i+1)%8==0 && i>0)
                  {
                  
                    outFile22.println();
                  
                  }
                }
                outFile22.close();
                  break;
          case 3:

                File mixed_letters2 = new File("Mixedpw.txt");
                PrintWriter outFile33 = new PrintWriter(mixed_letters2);
                
                for (int i=0; i<cmixedARR.length; i++)
                {
                
                  outFile33.print(cmixedARR[i]);
                  if ((i+1)%8==0 && i>0)
                  {
                  
                    outFile33.println();
                  
                  }
                }
                outFile33.close();
                  break;
          case 4:

                File mixed_letters_numbers2 = new File("MixedNumpw.txt");
                PrintWriter outFile44 = new PrintWriter(mixed_letters_numbers2);
                
                for (int i=0; i<cmixed_letters_numbersARR.length; i++)
                {
                
                  outFile44.print(cmixed_letters_numbersARR[i]);
                  if ((i+1)%8==0 && i>0)
                  {
                  
                    outFile44.println();
                  
                  }
                }
                outFile44.close();
                  break;
          case 5:

                File mixed_chars2 = new File("AllCharspw.txt");
                PrintWriter outFile55 = new PrintWriter(mixed_chars2);
               
                for (int i=0; i<cmixed_charsARR.length; i++)
                {
                
                  outFile55.print(cmixed_charsARR[i]);
                  if ((i+1)%8==0 && i>0)
                  {
                  
                    outFile55.println();
                  
                  }
                }
                outFile55.close();
                  break;
          case 0: System.out.println("Exiting Program...");
                  System.exit(0);
                  break;
          default :
               System.out.println("This is not a valid Menu Option! Please Select Another");
               break;

        }


      }


  }//MAIN METHOD ENDS HERE

  public static void ReadLower(int[] lowARR) throws FileNotFoundException
  {
      
    File lower = new File("Lower.txt");
    Scanner inputFile = new Scanner(lower);
    int i = 0;
    String tokens = "";
    while (inputFile.hasNext())
    {
      tokens = inputFile.next();
      lowARR[i]=Integer.parseInt(tokens);
      i++;
    }
    inputFile.close();;
    
  }

  
    public static void ReadUpper(int[] upperARR) throws FileNotFoundException
    {
        
      File upper = new File("Upper.txt");
      Scanner inputFile = new Scanner(upper);
      int i = 0;
      String tokens = "";
      while (inputFile.hasNext())
      {
        tokens = inputFile.next();
        upperARR[i]=Integer.parseInt(tokens);
        i++;
      }
      inputFile.close();;
      
    }

    public static void ReadMixedLetter(int[] mixedARR) throws FileNotFoundException
    {
        
      File mixed_letters = new File("Mixed_letters.txt");
      Scanner inputFile = new Scanner(mixed_letters);
      int i = 0;
      String tokens = "";
      while (inputFile.hasNext())
      {
        tokens = inputFile.next();
        mixedARR[i]=Integer.parseInt(tokens);
        i++;
      }
      inputFile.close();;
    }

    public static void ReadMixedLetterNumber(int[] mixed_letters_numbersARR) throws FileNotFoundException
    {
        
      File mixed_letters_numbers = new File("Mixed_letters_numbers.txt");
      Scanner inputFile = new Scanner(mixed_letters_numbers);
      int i = 0;
      String tokens = "";
      while (inputFile.hasNext())
      {
        tokens = inputFile.next();
        mixed_letters_numbersARR[i]=Integer.parseInt(tokens);
        i++;
      }
      inputFile.close();;
      
    }

    public static void ReadMixedChar(int[] mixed_charsARR) throws FileNotFoundException
    {
        
      File mixed_chars = new File("Mixed_chars.txt");
      Scanner inputFile = new Scanner(mixed_chars);
      int i = 0;
      String tokens = "";
      while (inputFile.hasNext())
      {
        tokens = inputFile.next();
        mixed_charsARR[i]=Integer.parseInt(tokens);
        i++;
      }
      inputFile.close();
    }

  

}




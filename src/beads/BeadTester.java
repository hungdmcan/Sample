package beads;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.Scanner;

public class BeadTester
{
   public static void main (String[] args)
   {
      Beads b1 = new Beads();
      b1.setColor("white");
      b1.setLetter('c');
      System.out.println(b1.getColor() + " " + b1.getLetter());

      Scanner input = new Scanner(System.in);
      System.out.println("Please input a word:");
      String word = input.nextLine();
      int index = word.length();
      System.out.println(index);
      char[] p = new char[index];
      for (int i = 0; i < index; i++) {
         p[i] = word.charAt(i);
      }
      for (int j = index - 1; j >= 0; j--) {
         System.out.print(p[j]);
      }

   }

}

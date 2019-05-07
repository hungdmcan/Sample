package beads;

/**
 *
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Beads
{
   /**
    * @param args the command line arguments
    */

   private String color;
   private char letter;

   /**
    * @return the color
    */
   public String getColor ()
   {
      return color;
   }

   /**
    * @param color the color to set
    */
   public void setColor (String color)
   {
      this.color = color;
   }

   /**
    * @return the letter
    */
   public char getLetter ()
   {
      return letter;
   }

   /**
    * @param letter the letter to set
    */
   public void setLetter (char letter)
   {
      this.letter = letter;
   }
}

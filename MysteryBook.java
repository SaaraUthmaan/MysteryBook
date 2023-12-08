import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class MysteryBook {
   public static void main(String[] args) {
      Scanner userReply = new Scanner(System.in);
      System.out.println("What is the current month?");
      String currentMonth = userReply.nextLine();
      System.out.println("How many days does this month have?");
      int daysInMonth = userReply.nextInt();
      int[] numDays = new int[daysInMonth];
      userReply.nextLine();
      String[] bookName = new String[daysInMonth];
      String listBooks = "";
      
      System.out.println("Please list all the books you want to read this month.");
      for(int i = 0; i < daysInMonth; i++){
         bookName[i] = userReply.nextLine();
         listBooks += bookName[i];
      }
      
      // Randomize the order of books(got some help)
      List<String> bookList = new ArrayList<>(Arrays.asList(bookName));
      Collections.shuffle(bookList);
      bookList.toArray(bookName);
      
      System.out.println("Connection between days and books:");
      for (int i = 0; i < daysInMonth; i++) {
         System.out.println("Day " + (i + 1) + ": " + bookName[i]);
      }
   }
   
}

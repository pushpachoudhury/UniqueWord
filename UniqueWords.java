/* Project: Lab 2: Git  
* Class: UniqueWords.java
* Author: Pushpa Choudhury
* Date: 10/02/2023
* This program goes through a ArrayList of words and counts how many words
* are unique to the list. To count the amount of unique words, the countUnique
* method creates an ArrayList, newList, that adds the words from the original list 
* to the new list if the specific word was not added yet. To get the count, count is 
* set equal to the newList size.
*/

import java.util.ArrayList;
import java.util.Collections;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
     Collections.sort(list);
     ArrayList <String> newList = new ArrayList<>();
     for (int i = 0; i < list.size(); i++) {
    	 String word = list.get(i);
    	 if (newList.contains(word)) {
    	 }
    	 else {
    		 newList.add(word);
    	 }
    	 count = newList.size();
     }
	  return count;
}

   public static void main(String[] args)
   {
	   ArrayList <String> words = new ArrayList<>();
	      words.add("apple");
		  words.add("orange");
		  words.add("blackboard");
		  words.add("apple");
		  words.add("orange");
		  words.add("sun");
		  words.add("moon");
		  
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}

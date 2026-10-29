/**
* You are going to write code to store a list of book titles for a 
* classroom library. You will create an ArrayList for Strings, then accept user 
* input to add titles to that ArrayList. There will be additional modifications 
* you can make:
*
* B Level:
* Accept input from users and add book titles to the ArrayList.
*
*   Example run:
*   Enter a title: Holes
*   Enter a title: Wonder
*   Enter a title: The Giver
*   Enter a title: ...      (keeps asking, adding each title to the list)
*
* B+ Level:
* Accept titles from users and stop accepting input when the user enters "done". 
* After this, the full list of titles should be printed, one title per line.
*
*   Example run:
*   Enter a title: Holes
*   Enter a title: Wonder
*   Enter a title: The Giver
*   Enter a title: done
*   Holes
*   Wonder
*   The Giver
*
* A- Level:
* Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
* title that already exists, tell them that the title has already been entered, but 
* continue accepting new titles.
*
*   Example run:
*   Enter a title: Holes
*   Enter a title: Wonder
*   Enter a title: Holes
*   Holes has already been entered.
*   Enter a title: The Giver
*   Enter a title: done
*   Holes
*   Wonder
*   The Giver
*
* A+ Level:
* Complete B and B+. Modify A- so that when a duplicate title is entered, the user 
* is asked whether they want to remove the existing title. If they enter "yes", the 
* title is removed from the list. If they type anything else, the duplicate title is 
* ignored, and no change is made to the list.
*
*   Example run:
*   Enter a title: Holes
*   Enter a title: Wonder
*   Enter a title: The Giver
*   Enter a title: Holes
*   Holes has already been entered. Do you want to remove it? (yes/no): yes
*   Holes has been removed.
*   Enter a title: Wonder
*   Wonder has already been entered. Do you want to remove it? (yes/no): no
*   No change made.
*   Enter a title: done
*   Wonder
*   The Giver
 */

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
    }
}

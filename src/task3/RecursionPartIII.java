package task3;

public class RecursionPartIII {
    // Precondition: x is less than or equal to y
    // Postcondition: This method prints a pattern of 2*(y-x+1) lines
    // to the stdout (console). The first line contains x asterisks, the next
    // line contains x+1 asterisks, and so on up to a line with y asterisks.
    // Then the pattern is then reversed backwards, going y back down to x.
      /* Example output:
         pattern(3, 5) will output:
         ***
         ****
         *****
         *****
         ****
         ***
    */
    public static void pattern(int x, int y) {
    	
		StringBuilder a = new StringBuilder();
	
		for (int i = x; i > 0; i--) {
		    a.append("*");
        }
		
		System.out.println(a);
	
		if (x == y) {
		    System.out.println(a);
		    return;
		}
		pattern(x + 1, y);
		System.out.println(a);
        
    }

    // Precondition: none
    // Postcondition: This method outputs a string (title) followed by numbers
    // of the form 1.1, 1.2, 1.3 etc... The levels input parameter, determines how // many levels the section numbers have. To clarify, an input of levels equal // to 2, would have section number of the form x.y. Likewise, if levels is
    // equal to 3, would have section number of the form x.y.z. Please note the // digits permitted in each level are only 1 - 9.
    /* Example output:
       level("TITLE", 2) will output:
       TITLE1.1.
       TITLE1.2.
       TITLE1.3.
    //and end by printing
       TITLE9.7.
       TITLE9.8.
       TITLE9.9.
    */
    public static void level(String title, int levels) {
        if(levels == 0) {
            System.out.println(title);
            return;
        }

        for(int i = 1; i <= 9; i++) {
            level(title + Integer.toString(i) + ".", levels - 1);
        }
    }

    public static void main(String[] args) {
//    	pattern(3,5);
        level("TITLE", 3);
    }
}

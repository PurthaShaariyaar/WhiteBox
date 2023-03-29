package src;
public class Occurrence {
  
  // Function to count the number of character occurrences 
  public static int numOccurrence(char[] charArr, char character) {
    
    // Initialize count to zero 
    int count = 0; 
    
      // Iterate through character array to count the occurrence of character in the array
    for (char c : charArr) {
      
      // If c is equivalent to the character, increment count by one
      if (c == character) {
        count++;
      }
    }

    // Return number of occurrences
    return count; 
  }
}
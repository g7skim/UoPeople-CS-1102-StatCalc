  /* 
    * The program calculates and then displays as output to the console,
    * the following statistics against the set of numbers given below.
    * Statistics that must be calculated:
        * Count – Quantity of numbers in the data set.
        * Mean – The mean or average of the numbers in the data set.
        * Standard Deviation – The measure of variance (or dispersion) from the mean.
    * (Input ends when user enters = .
    *
    * This program uses StatCalc.java
    * @author  Eugene Vereshchagin (g7skim)
    * @email   jamuday@me.com
    * @since   2017-07-17 
  */
     
     public class SimpleStats {
     
        public static void main(String[] args) {
           
           StatCalc myStatCalc;  // Computes statistics for numbers entered by user.
           myStatCalc = new StatCalc();
           
           double number;    // Value for a number entered by the user.
           
           TextIO.putln("Enter your numbers below.  Then, enter = to calculate and show the results.");
           TextIO.putln();
           
           do {
              TextIO.put("... ");
              number = TextIO.getlnChar();
              if (number != '=')
                 myStatCalc.enter(number);
           } while ( number != '=' );
           
           TextIO.putln("\nThis is statistics about your numbers:\n");
           TextIO.putln("   Count (Quantity of numbers in the data set):                                    " + myStatCalc.getCount());
           TextIO.putln("   Average(The mean or average of the numbers in the data set):                    " + myStatCalc.getMean());
           TextIO.putln("   Standard Deviation (The measure of variance (or dispersion) from the mean):     " + myStatCalc.getStandardDeviation());
           
        }
        
     }
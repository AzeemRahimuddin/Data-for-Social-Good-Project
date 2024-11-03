import java.util.Arrays;

public class UserStory {

  // Instance Variables for arrays representing vehicle data
private int [] Model_Year;
private int [] Electric_Range;
private String [] City;
private String [] Make;
private String [] Model;

// Variables to store results
private String MaxValue; 
private int MaxNumber;
private String [] Temp;


/*
 *  No-argument constructor.
 * Initializes the instance variables with default values.
 */
  public UserStory(){
this.Model_Year = new int[] {0};
this.Electric_Range = new int[] {0};
this.City = new String[] {"N/A"};
this.Make = new String[] {"N/A"};
this.Model = new String[] {"N/A"}; 
  }
 
 /*
  * Parameterized constructor for UserStory class.
  * Initializes the instance variables with the provided values.
  *  Model_Year Array of integers representing the model years of vehicles.
  *  Electric_Range Array of integers representing the electric ranges of vehicles.
  * City Array of strings representing the city names.
  *  Make Array of strings representing the vehicle makes.
  * Model Array of strings representing the vehicle models.
  */
public UserStory (int[] Model_Year, int [] Electric_Range, String [] City, String [] Make, String[] Model){
this.Model_Year  = Model_Year;
this.Electric_Range = Electric_Range;
this.City = City;
this.Make = Make;
this.Model = Model;
}



 /*
* Method to find the most frequently occurring string in an array. 
*  inputArray Array of strings to be analyzed.
* This method sorts the input array, counts the occurrences of each string,
* and determines which string appears the most frequently, storing it in MaxValue.
*/
public void get_Most(String[] inputArray){
  int count = 0;
  int max_count = 0;
  String MaxName = "";

  // From the java.util.Arrays, arrays.sort method was imported/ manipulated the City array
  Arrays.sort(inputArray);

   // Create a temporary copy of the sorted array for counting occurrences
  this.Temp = Arrays.copyOf(inputArray, 10000);
  
 
// Iterate through the sorted array to find the string with the highest frequency
  for (int i = 1; i < 10000; i++){
     if (Temp[i].equals(Temp[i-1]))
       count=count+1;
     else
       count=1;
     if (count > max_count){
        max_count = count;
        MaxName = Temp[i-1]; 
      } 
  }
  this.MaxValue = MaxName; // Store the most frequent string
  }

 /*
 * Method to calculate the average electric range of models from years before 2020.
 * This method iterates through the Model_Year and Electric_Range arrays,
 * accumulating the total range for eligible models and counting them
 * to calculate the average.
   */
public void  getAverageRange(){
  int count = 0;
  int total = 0;
  int Range_total = 0;
  int Range_average = 0;

  // Loop through the Model_Year and Electric_Range arrays
  for (int index =0; index < 10000; index++){
     if (Model_Year[index] < 2020){ // Check if the model year is before 2020
          if(Electric_Range[index] > 0){
                  count=count+1;
                  Range_total = Range_total + Electric_Range[index];
          }
     }
}
  Range_average = Range_total/count; // Calculate the average range
  MaxNumber = Range_average; // Store the average range in MaxNumber
 
}

 /*
 * Override toString method to return the most frequent city name found.
 * A string representing the most frequently occurring city.
 */
public String toString(){
String information = MaxValue;
 return information;
}

 /*
* Overloaded toString method to return the average electric range.
* Returns the average electric range as an integer.
*/
public int toString(int x){
int information = MaxNumber;
 return information;
}




}


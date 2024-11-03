/*
* Our group analyzed a datset of the different types of electric cars in the state of Washington 
* based on the first 10,000 results in our data set.
* We wanted to find out what car model is the most popular as well as the average range of cars older than 
* 5 years old.
* We also found out which city is the most environmentally friendly based on the most amount of EVs.
*/

public class DataRunner {
  

/*
 * Main method that serves as the entry point for the program. 
 * It reads data from text files, initializes UserStory objects,
 * and invokes methods to compute and display results.
 */
  public static void main(String[] args) {

  // Read data from text files and convert them into arrays
  int [] RangeArray = FileReader.toIntArray("Electric_Range.txt");
  int [] ModelYearArray = FileReader.toIntArray("Model_Year.txt");
  String [] CityArray = FileReader.toStringArray("City.txt");
  String[] MakeArray = FileReader.toStringArray("Make.txt");
  String[] ModelArray = FileReader.toStringArray("Model.txt");

  // Initialize UserStory objects to analyze the data
  UserStory myDefaultUserStory = new UserStory();
  UserStory myUserStory = new UserStory(ModelYearArray, RangeArray, CityArray, MakeArray, ModelArray);
  


  // Call the methods to provide information about electric vehicles
myUserStory.getAverageRange();
System.out.print(" \n The average range for electric cars greater than 5 years older (miles):  ");
System.out.print(myUserStory.toString(1));


 // Find and display the most frequently occurring city name    
myUserStory.get_Most(CityArray);
System.out.print(" \n The city that has the most of amount of electric vehicles:  ");
System.out.print(myUserStory.toString());

 // Find and display the most frequently occurring make name
myUserStory.get_Most(MakeArray);
System.out.print(" \n The make of the car that is the most common is :  ");
System.out.print(myUserStory.toString());

// Find and display the most frequently occurring model name
myUserStory.get_Most(ModelArray);
System.out.print("\n The model of the car that is the most common is :  ");
System.out.print(myUserStory.toString());


    
    
    
  }
}
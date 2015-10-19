# October 19th


### Notes on classes
  What do you want to know?
  
  class v. object, reference variables, instantiation, constructor, accessors/mutators, data visibility, instances, imports

## Project 2 Activity 3- randomization
[Random API] (https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
```
import java.util.Random;  // Needed for the Random class
public class ObjectDemo
{
   public static void main(String[] args) 
   {
      int number;        // To hold a random number
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      
      // Generate a random integer.
      number = rand.nextInt();
      //READ THE API
      
      
      // Write the random integer to the file.
      System.out.println(number);
      
   }
}

```

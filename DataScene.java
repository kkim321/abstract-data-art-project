import org.code.theater.*;
import org.code.media.*;

/*
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

    private Cereal[] cereals; // 1D array of Cereal objects

    /** Constructor */
    public DataScene() {
        cereals = createCereals();
    }

    /**
     * Returns a 1D array of Cereal objects using the txt files
     */
    public Cereal[] createCereals() {
        String[] nameArray = FileReader.toStringArray("names.txt");
        int[] calorieArray = FileReader.toIntArray("calories.txt");
        int[] sugarArray = FileReader.toIntArray("sugar.txt");
        int[] proteinArray = FileReader.toIntArray("protein.txt");
      

        Cereal[] cerealArray = new Cereal[nameArray.length];
        for (int i = 0; i < cerealArray.length; i++) {
            cerealArray[i] = new Cereal(nameArray[i], calorieArray[i], sugarArray[i], proteinArray[i]);
        }

        return cerealArray;
    }

/*
*Generates a random cereal brand and gets all of its data
*/
  public int randomCereal(){
  int randomIndex = (int) (Math.random() * cereals.length);

    // Gets the random Cereal object and return its toString representation
    return randomIndex;
      
    }
  
    /*
  *Draws the Scene 
  */
  public void drawScene() { 
  int randomCereal = randomCereal();
  playSound("yummy.wav");
  pause(0.5);
  System.out.println("Random Cereal: \n" + randomCereal);
  for (int i = 5; i >= 0; i--) { 
  clear("pink"); // Sets the screen with a pink background

  
    drawText("Cereal", 90, 50);
    drawText("Name: "+ cereals[randomCereal].getName(), 30, 100);
    drawText("Calories: "+ cereals[randomCereal].getCalorie(), 30, 150);
    drawText("Grams of Sugar: "+ cereals[randomCereal].getSugar(), 30, 200);
    drawText("Grams of Protein: "+ cereals[randomCereal].getProtein(), 30, 250);
   
    setTextColor("black"); // Sets text color to black
    drawText(String.valueOf(i), 200, 300); // Draws the current number
    pause(1); // Pause for 1 second

}

    
  }
}
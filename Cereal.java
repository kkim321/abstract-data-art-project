import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Cereal with a name, calories, sugar, and protein
 */
public class Cereal {

  private String name;     // name of the cereal
  private int calorie; //calories of the cereal
  private int sugar; // sugar of the cereal
  private int protein; // protein of the cereal
  

  /** Constructor */
  public Cereal( String name, int calorie, int sugar, int protein) {
    this.name = name;
    this.calorie = calorie;
    this.sugar = sugar;
    this.protein = protein;
    
  }

  /**
  *Accessor Method for name
  */
  public String getName() {
    return name;
  }
  /**
  *Accessor Method for calorie
  */
  public int getCalorie() {
    return calorie;
  }
  /**
  *Accessor Method for sugar
  */
  public int getSugar() {
    return sugar;
  }

  /**
  *Accessor Method for protein
  */
    public int getProtein() {
    return protein;
  }
  
 /*
 *To String Method 
 */
  public String toString() {
    return "Name: "+ name + "\nCalorie: "+ calorie + "\nSugar: "+ sugar + "\nProtein: "+ protein;
  }
  
}
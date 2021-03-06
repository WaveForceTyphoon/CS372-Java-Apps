/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.food;

/**
 *
 * @author showland17
 */
public class Chicken extends FoodItem {
    /**
     * No changes from the FoodItem constructor
     * @param weight The weight-to-be of the object
     * @param volume The volume-to-be of the object
     */
    public Chicken(int weight, int volume, int currentTime) {
        super(weight, volume, currentTime);
        expirationTime = currentTime + 9001;
    }
    
    public String toString() {
        return "Chicken";
    }
    
    /**
     * Coffee-specific behavior which prints a unique message to the console
     */
    public void Grind() {
        System.out.println("Warming up the clucks now, sir.\n");
    }
}

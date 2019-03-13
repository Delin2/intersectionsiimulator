/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */

package intersectionsimulator;

public class Vehicle {
    private int serialID;
    private int timeArrived;
    private static int serialCounter = 0;
    
    /**
     *Default Constructor. You should automatically increment the serialCounter, and set the serialID to the serialCounter.
    Parameters:
        initTimeArrived
            Time the vehicle arrived at the intersection.
    Preconditions:
        initTimeArrived > 0.
    Throws:
        IllegalArgumentException - If initTimeArrived ≤ 0.
     * @param initTimeArrived 
     */
    public Vehicle(int initTimeArrived){
        timeArrived = initTimeArrived;
        serialID = serialCounter;
        serialCounter++;
    }
    
     /**
     * getter for serialID
     * @return serialID
     *      serialID of vehicle
     */
    public int getserialID(){
        return serialID;
    }
    
     /**
     * getter for timeArrived
     * @return timeArrived
     *      TimeArrived of vehicle
     */
    public int gettimeArrived(){
        return timeArrived;
    }
}

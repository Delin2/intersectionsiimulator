/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */
package intersectionsimulator;
import java.util.ArrayList;

public class Intersection {
    private TwoWayRoad[] roads;
    private int lightindex;
    private int countdownTimer;
    
    public Intersection(TwoWayRoad[] initRoads)throws IllegalArgumentException{
        if(roads == null){
            throw new IllegalArgumentException("Error");
        }else
            roads = initRoads;
    }
    
    public Vehicle[] timeStep(){
        ArrayList<Vehicle> tS = new ArrayList<Vehicle>();
        for(int i =0; i < roads.length; i++){
            Vehicle[] vs = roads[i].proceed(countdownTimer);
                for(int j = 0; j < vs.length; j++){
                   tS.add(vs[j]);
                }
        }return tS.toArray(new Vehicle[tS.size()]);
    }
}

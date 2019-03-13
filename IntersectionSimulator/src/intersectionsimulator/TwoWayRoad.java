/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */

package intersectionsimulator;

public class TwoWayRoad {
    public final int FORWARD_WAY=0;
    public final int BACKWARD_WAY=1;
    public final int NUM_WAYS=2;
    public final int LEFT_LANE=0;
    public final int MIDDLE_LANE=1;
    public final int RIGHT_LANE=2;
    public final int NUM_LANES=3;
    private String name;
    private int greenTime;
    private int leftSignalGreenTime;
    private VehicleQueue[][] lanes;
    private LightValue lightValue;
    
    public TwoWayRoad(String initName, int initGreenTime, VehicleQueue[][] lanes){
        if(initGreenTime <= 0 || initName == null)
            throw new IllegalArgumentException("Invalid Name or GreenTime");
        name = initName;
        greenTime = initGreenTime;
    }
        
    public Vehicle[] proceed(int timerVal)throws IllegalArgumentException{
        if(timerVal <= 0){
            throw new IllegalArgumentException("Invalid Timer");
        }else if(timerVal == 1){
            lightValue = LightValue.RED;
        }else if(timerVal <= leftSignalGreenTime){
            lightValue = LightValue.LEFT_SIGNAL;
                if(lanes[0][0].isEmpty() && lanes[0][1].isEmpty())
                    
        }else{
            lightValue = LightValue.Green;
            for (int j = 0; j < lanes.length; j++;) {
                    BooleanSource bs = new BooleanSource(.5);
                        if(bs.occurs() == true){
                            Vehicle vehicle = new Vehicle(timerVal);
                              
                        }
            }        
            }return ;
    }    
    
    public void enqueueVehicle(int wayIndex, int laneIndex, Vehicle vehicle) throws IllegalArgumentException{
        if(wayIndex > 1 || wayIndex < 0 || laneIndex < 0 || laneIndex> 2 || vehicle == null){
            throw new IllegalArgumentException("Error");
        }else
            lanes[wayIndex][laneIndex].add(vehicle);
    }
    
    public boolean isLaneEmpty(int wayIndex, int laneIndex){
        if(lanes[wayIndex][laneIndex].size() == 0)
            return true;
        else
            return false;
    }
}

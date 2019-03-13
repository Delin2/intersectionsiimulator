/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */

package intersectionsimulator;

import java.util.LinkedList;

public class VehicleQueue<Vehicle> extends LinkedList<Vehicle> {
    private LinkedList list;
    
    public VehicleQueue(){
    list = new LinkedList();
    }
    
    public boolean isEmpty(){
        return (list.size() == 0);
    }
    
    public void Vehicleenqueue(Vehicle v){
        list.add(v);
    }
    
    public Vehicle dequeue(){
        Vehicle v = (Vehicle) list.get(1);
        list.remove(1);
        return v;
    }
    
    public Object Vehiclepeek(){
        return list.get(1);
    }
    
}

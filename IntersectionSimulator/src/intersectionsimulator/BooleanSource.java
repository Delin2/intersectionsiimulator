/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */

package intersectionsimulator;

public class BooleanSource {
    private double probability;
    
    public BooleanSource(double initProbabilty){
        if(initProbabilty <= 0 || initProbabilty > 1)
            throw new IllegalArgumentException("Invalid Probabilty");
        probability = initProbabilty;
    }
    
    public boolean occurs(){
        if(Math.random()< probability) 
           return true;
        else
            return false;
    }
    
    /**
     * Getter for probability
     * @return probability
     */
    public double getProbability(){
        return probability;
    }
    
    /**
     * Setter for probability
     * @param newProb 
     */
    public void setProbability(double newProb){
        probability = newProb;
    }
}

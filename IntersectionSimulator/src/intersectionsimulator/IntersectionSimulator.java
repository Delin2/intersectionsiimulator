/**
* Dennis Lin
* 109426873
* Homework #4
* CSE214 R05 
* Recitation TA: Vladimir Yevseenko
 */

package intersectionsimulator;
import java.util.Scanner;

public class IntersectionSimulator {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to IntersectionSimulator 2016\n");
        System.out.println("Input the simulation time:");
        int simulationTime = input.nextInt();
        System.out.println("Input the arrival probability:");
        double arrivalProbabillity = input.nextDouble();
        System.out.println("Input number of Streets:");
        int numStreets = input.nextInt();
        
    }
    
}

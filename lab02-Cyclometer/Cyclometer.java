// Cole Evans
// Lab02- Cyclometer
// Cyclometer program
// program
//
public class Cyclometer {
    	
   	public static void main(String[] args) {

// our input data
	   	int secsTrip1=480;  // the amount of seconds for trip 1
       	int secsTrip2=3220;  // the amount of seconds for trip 2
		int countsTrip1=1561;  // the amount of counts for trip 1
		int countsTrip2=9037; // the amount of counts for trip 2
		
		// our intermediate variables and output data.
double wheelDiameter=27.0,  // the diameter of the wheel
  	PI=3.14159, // Pi used to count the number of rotations
  	feetPerMile=5280,  // the amount of feet in a mile
  	inchesPerFoot=12,   // amount of inches in a foot
  	secondsPerMinute=60;  // amount of seconds in a minute
	double distanceTrip1, distanceTrip2, totalDistance;  //
	
	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
       	      //
		//calculation here. 
		//
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
	
		//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	
	}  //end of main method   
	
	
} //end of class

package LabOne;

public class DistanceCalculator {

	private DistanceCalculator() {
		
	}//end empty argument constructor
	
	public static double calculateDistance(int x, int y, int a, int b) {
		int xaDist = Math.abs(x - a);
		int ybDist = Math.abs(y - b);
		double totDist = Math.sqrt(Math.pow(xaDist, 2) + Math.pow(ybDist, 2));
		return totDist;
	}//end calculateDistance
	
}//end class
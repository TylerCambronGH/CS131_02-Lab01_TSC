package LabOne;

public class DateManipulator {

	public DateManipulator() {
		
	}
	
	public boolean isLeapYear(int year) {
		if (year < 1582) {
			return false;
		} else if ((year%4 == 0) && (year%400 == 0)) {
			return true;
		} else if ((year%4 == 0) || (year%400 == 0)) {
			if (year%100 == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
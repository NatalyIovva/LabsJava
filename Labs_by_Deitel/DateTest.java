package home;


public class DateTest {
	public static void main(String[] args){
		Date d1 = new Date(29,2,2016);
		Date d2 = new Date(30,2,2016);
		Date d3 = new Date(0,2,2016);
		Date d4 = new Date(29,2,2015);
		Date d5 = new Date(32,7,2016);
		Date d6 = new Date(31,4,2016);
		Date d7 = new Date(30,1,2016);
		d1.displayDate();
		d2.displayDate();
		d3.displayDate();
		d4.displayDate();
		d5.displayDate();
		d6.displayDate();
		d7.displayDate();
	}
}

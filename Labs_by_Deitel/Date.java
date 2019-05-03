package home;


public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year) {
		setYear(year);
		setMonth(month);
		setDay(day,month,year);
	}
	public void setDay(int day,int month,int year) {
		if(day>0) {
		if(((month<=7)&&(month%2==1))||((month<=12)&&(month%2==0))&&(month!=2)) {
		if(day<32) {
			this.day = day;
			}
		}
		if((month==2)) {
			if(year%4==0) {
				if(day<=29) {this.day = day;
				}
			}
			else if(day<=28) {
				this.day = day;
			}
		}
		if(((month<7)&&(month%2==0)&&(month!=2))||((month<12)&&(month%2==1))){
			if(day<=30) {this.day = day;
			}
		}
	}
	}
	public void setMonth(int month) {
		if(month<=12||month>0){
			this.month = month;}
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.printf("%n%d/%d/%d",day,month,year);
	}

}



public class Date {

	private int day,month,year;
		
		public Date(int day, int month, int year) {
			
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		
		public Date() {
			// TODO Auto-generated constructor stub
		}


		public void setDay(int day)
		{
			this.day=day;
			
		}
		public int getDay()
		{
			return day;
			
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		public void displayDate()
		{
			System.out.println("Date:"+day+"/"+month+"/"+year);
		}
		
		
	
	
}

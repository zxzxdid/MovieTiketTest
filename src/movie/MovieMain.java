package movie;

	public class MovieMain {

		public static void main(String[] args) {
			
			
			Movie m1 = new Movie("1917", 11000, 10, "인터넷"); // class Movie에 있는 생성자 Movie(String movieName, int price, int age, String way)를 
			Movie m2 = new Movie("주디", 15000, 25, "현장");
			Movie m3 = new Movie("인비저블맨", 12500, 40, "쿠폰");
			
			
			m1.titlePrint();
			
			m1.dataPrint();
			m2.dataPrint();
			m3.dataPrint();
			
			
			
	}
}

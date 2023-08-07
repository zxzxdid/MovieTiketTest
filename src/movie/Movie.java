package movie;

public class Movie {
	String movieName; // 영화이름
	int price; // 영화 가격
	int age;     // 고객 나이
	int money;    // 지불 금액
	double rate;  // 할인율
	String way = "현장"; // 구매방법

	public Movie(String movieName, int price, int age, String way) { 
		this.movieName = movieName;
		this.price = price;
		this.age = age;
		this.way = way;
	}
	
	void dataPrint() {
		rateCal();
		moneyCal();
		System.out.println(movieName + "\t\t" + price + "\t\t" + age + "\t\t" + money + "\n");
	}
	
	void moneyCal() {
		money = price - (int)(price * rate);
	}
	
	void rateCal() {
			switch (way) {
				
			case "현장" :
				rate = 0;
				break;

			case "인터넷" :
				rate = 0.05;
				break;				
				
			case "쿠폰" :
				rate = 0.10;
				break;
			}
				if(age < 20)
					rate += 0.25 ;
				else if(age >= 20 && age < 30)
					rate += 0.20;
				else
					rate += 0.15;
	}
	

	
	void titlePrint() {
		System.out.println("영화명\t\t금액\t\t나이\t\t실구매가격 \n");
	}
	
	
}

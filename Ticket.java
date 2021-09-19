public class Ticket {
	
	private String TicketNum;
	void set_TicketNum(String TN) {
		TicketNum = TN;
	}
	private String MusicalTitle;
	void set_MusicalTitle(String MT) {
		 MusicalTitle = MT;
	}
	private int price;
	void set_price(int p ) {
		price = p;
	}
	private String SeatNum;
	void set_SeatNum(String SN ) {
		SeatNum = SN;
	}
	private String RunnigTime;
	void set_RunnigTime(String RT) {
		RunnigTime = RT; 	
	
	}
	private int seat;
	private int mseat;
	
	
	void SeatNum(int s) {
		seat =s;
		System.out.println("<티켓 남은 개 수>");
		System.out.println(s+"개 입니다.");
		System.out.println();
		
	}
	void SeatNum(int s, int m) {
		seat =s;
		mseat=m;
		int minus = s-m;
		System.out.println("<티켓 남은 개 수>");
		System.out.println(minus+"개 입니다.");
		System.out.println();
		
	}
	
	int getPrice() {
		return price;
		
	}
	
	void TicketInfo() {
		System.out.println("티켓 번호:"+TicketNum);
		System.out.println("뮤지컬 제목:"+ MusicalTitle);
		System.out.println("티켓 가격:"+price);
		System.out.println("좌석 번호:"+SeatNum);
		System.out.println("러닝타임:"+RunnigTime);
	}
	void Sell() {
		System.out.println("<결제 화면 >");
		System.out.println("티켓의 가격은"+price+"원 입니다.");
		System.out.println(price+"원을 결제해주세요.");
		System.out.println();
	}
	

}

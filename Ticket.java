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
		System.out.println("<Ƽ�� ���� �� ��>");
		System.out.println(s+"�� �Դϴ�.");
		System.out.println();
		
	}
	void SeatNum(int s, int m) {
		seat =s;
		mseat=m;
		int minus = s-m;
		System.out.println("<Ƽ�� ���� �� ��>");
		System.out.println(minus+"�� �Դϴ�.");
		System.out.println();
		
	}
	
	int getPrice() {
		return price;
		
	}
	
	void TicketInfo() {
		System.out.println("Ƽ�� ��ȣ:"+TicketNum);
		System.out.println("������ ����:"+ MusicalTitle);
		System.out.println("Ƽ�� ����:"+price);
		System.out.println("�¼� ��ȣ:"+SeatNum);
		System.out.println("����Ÿ��:"+RunnigTime);
	}
	void Sell() {
		System.out.println("<���� ȭ�� >");
		System.out.println("Ƽ���� ������"+price+"�� �Դϴ�.");
		System.out.println(price+"���� �������ּ���.");
		System.out.println();
	}
	

}

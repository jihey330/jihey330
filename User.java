
public class User {
	private String UserID;
	void set_UserID(String ID) {
		UserID =ID;
		}
	
	private String UserName;
	void set_UserName(String UN) {
		UserName =UN;
		}
	private String PhoneNumber;
	void set_PhoneNumber(String PN) {
		PhoneNumber =PN;
		}
	private int Mymoney;
	void set_Mymoney(int M) {
		Mymoney =M ;
		}
	
	private int own;
	private int buy;
	
	void Myticket(int o) {
		own =o;
		System.out.println("<현재 가지고 있는 티켓의 수 >");
		System.out.println(o+"개 입니다.");
		System.out.println();
		
	}
	void Myticket(int o, int b) {
		own =o;
		buy=b;
		int sum = o+b;
		System.out.println("<현재 가지고 있는 티켓의 수 >");
		System.out.println(sum+"개 입니다.");
		System.out.println();
	}
	
	
	void UserInfo() {
		System.out.println("<고객 정보>");
	System.out.println("고객 아이디:"+UserID);
	System.out.println("고객 이름:"+UserName);
	System.out.println("핸드폰 번호:"+PhoneNumber);
	System.out.println();
	
	}
	
	void TicketBuyView(Ticket ticket) {
		System.out.println("<티켓 구매>");
		ticket.TicketInfo();
		System.out.println();
		
	}
	void TicketBuy(Ticket ticket) {
		if(Mymoney>=160000)
		Mymoney = Mymoney- ticket.getPrice();
		else
			System.out.println("금액이 부족합니다. 결제를 할 수 없습니다.");
			System.out.println();
	
		}
	
	void checkMoney() {
		System.out.println("<소지한 금액 확인>");
		System.out.println("금액:"+Mymoney+"원");
		System.out.println();
	}
	void recheckMoney() {
		System.out.println("<남은 금액 확인>");
		System.out.println("금액:"+Mymoney+"원");
		System.out.println();

	}
	void Buy() {
		System.out.println("<예매 완료>");
		System.out.println("감사합니다!결제가 정상적으로 완료되었습니다.");
		System.out.println("남은 금액은"+Mymoney+"원 입니다.");
		System.out.println();
	}
	void checkTicket(Ticket ticket) {
	System.out.println("<구매한 티켓 확인>");
	ticket.TicketInfo();
	System.out.println("예매상태 :예매 완료");
	System.out.println();
	}
	
}


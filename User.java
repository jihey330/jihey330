
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
		System.out.println("<���� ������ �ִ� Ƽ���� �� >");
		System.out.println(o+"�� �Դϴ�.");
		System.out.println();
		
	}
	void Myticket(int o, int b) {
		own =o;
		buy=b;
		int sum = o+b;
		System.out.println("<���� ������ �ִ� Ƽ���� �� >");
		System.out.println(sum+"�� �Դϴ�.");
		System.out.println();
	}
	
	
	void UserInfo() {
		System.out.println("<�� ����>");
	System.out.println("�� ���̵�:"+UserID);
	System.out.println("�� �̸�:"+UserName);
	System.out.println("�ڵ��� ��ȣ:"+PhoneNumber);
	System.out.println();
	
	}
	
	void TicketBuyView(Ticket ticket) {
		System.out.println("<Ƽ�� ����>");
		ticket.TicketInfo();
		System.out.println();
		
	}
	void TicketBuy(Ticket ticket) {
		if(Mymoney>=160000)
		Mymoney = Mymoney- ticket.getPrice();
		else
			System.out.println("�ݾ��� �����մϴ�. ������ �� �� �����ϴ�.");
			System.out.println();
	
		}
	
	void checkMoney() {
		System.out.println("<������ �ݾ� Ȯ��>");
		System.out.println("�ݾ�:"+Mymoney+"��");
		System.out.println();
	}
	void recheckMoney() {
		System.out.println("<���� �ݾ� Ȯ��>");
		System.out.println("�ݾ�:"+Mymoney+"��");
		System.out.println();

	}
	void Buy() {
		System.out.println("<���� �Ϸ�>");
		System.out.println("�����մϴ�!������ ���������� �Ϸ�Ǿ����ϴ�.");
		System.out.println("���� �ݾ���"+Mymoney+"�� �Դϴ�.");
		System.out.println();
	}
	void checkTicket(Ticket ticket) {
	System.out.println("<������ Ƽ�� Ȯ��>");
	ticket.TicketInfo();
	System.out.println("���Ż��� :���� �Ϸ�");
	System.out.println();
	}
	
}


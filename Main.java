
	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			User Interpark = new User();
			Interpark.set_UserID("jjjhhhh");
			Interpark.set_UserName("장지혜");
			Interpark.set_PhoneNumber("010-3333-0000");
			Interpark.set_Mymoney(200000);
			
			Ticket dracula1 = new Ticket();
			dracula1.set_TicketNum("T19340934");
			dracula1.set_MusicalTitle("드라큘라");
			dracula1.set_price(160000);
			dracula1.set_SeatNum("1층 B구역 1번");
			dracula1.set_RunnigTime("180분");
			
			Ticket dracula2 = new Ticket();
			dracula2.set_TicketNum("T19340935");
			dracula2.set_MusicalTitle("드라큘라");
			dracula2.set_price(160000);
			dracula2.set_SeatNum("1층 B구역 2번");
			dracula2.set_RunnigTime("180분");
			
			
			Interpark.UserInfo();
			Interpark.checkMoney();
			Interpark.Myticket(0);
			System.out.println("----------------------");
			System.out.println("1번");
			Interpark.TicketBuyView(dracula1);
			System.out.println("2번");
			Interpark.TicketBuyView(dracula2);
			dracula1.SeatNum(2);
			System.out.println(">1번 티켓을 구매한다.");
			System.out.println();
			dracula1.Sell();
			Interpark.TicketBuy(dracula1);
			Interpark.Buy();
			dracula1.SeatNum(2,1);
			Interpark.Myticket(0,1);
			Interpark.checkTicket(dracula1);
			System.out.println("----------------------");
			System.out.println("======================");
			System.out.println("1번");
			Interpark.TicketBuyView(dracula2);
			dracula1.SeatNum(1);
			System.out.println(">1번 티켓을 구매한다.");
			System.out.println();
			dracula2.Sell();
			Interpark.TicketBuy(dracula2);
			Interpark.recheckMoney();	
			
		}

		}
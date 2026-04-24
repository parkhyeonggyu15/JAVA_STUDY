package CH01;


//관객이 매표원에게 영화표 1장을 예매한다
//클래스 	: 관객
//속성 	: 보유금액
//		: 티켓개수
//기능 	: 예매하기(매표원, 보유금액의 일부)
//
//클래스 	: 매표원
//속성	: 보유금액
//		: 티켓재고
//		: 티켓가격
//기능	: 발권하기(관객의 돈) : 티켓개수


//관객이 매표원에게 영화표 1장을 예매한다
//
//클래스 	: 관객(Audience)
//속성 	: 보유금액(myMoney : int)
//		: 티켓개수(ticketCnt : int)
//
//기능 	: 예매하기(매표원, 보유금액의 일부)
//		: reserve(TicketSeller seller , int money) : void
//
//
//클래스 	: 매표원(TicketSeller)
//속성	: 보유금액(myMoney : int)
//		: 티켓재고(ticketCnt : int)
//		: 티켓가격(price : int)
//
//기능	: 발권하기(관객의 돈) : 티켓개수
//		  issue(int money) : int
class Audience {
	private int myMoney;
	private int ticketCnt;
	
	Audience (int myMoney, int ticketCnt){ //2. 생성자 호출됨
		this.myMoney = myMoney;				//3. 멤버변수 myMoney를 매개변수 myMoney(100000)값으로 초기화
		this.ticketCnt = ticketCnt;			//4. 멤버변수 ticketCnt를 매개변수 ticketCnt(0)값으로 초기화

	}
	
	void reserve(TicketSeller seller , int money) { //11. 메서드 호출됨
		this.myMoney-= money;						//12. 멤버변수 myMoney값을 매개변수 money(15000)값만큼 차감
		int myticketCnt = seller.issue(money);		//13. 지역변수 myticketCnt 선언 후 seller(매표원)메소드에 매개변수 값 전달 후 접근
		this.ticketCnt+=myticketCnt;				//19. 멤버변수 ticketCnt값에 myticketCnt값만큼 누적
	}

	@Override
	public String toString() { 						//21.Audience클래스 호출됨
		return "관객 [보유금액=" + myMoney + ", 티켓개수=" + ticketCnt + "]";
	}
	
}
class TicketSeller {
	private int myMoney;
	private int ticketCnt;
	private int price;
	
	TicketSeller(int myMoney, int ticketCnt, int price){ //6. 생성자 호출됨
		this.myMoney = myMoney;							//7. 멤버변수 myMoney를 전달받은 매개변수 myMoney(100000)값으로 초기화
		this.ticketCnt = ticketCnt;						//8. 멤버변수 ticketCnt를 전달받은 매개변수 ticketCnt(10)값으로 초기화
		this.price = price;								//9. 멤버변수 price를 전달받은 매개변수 price(15000)값으로 초기화
	}
	  int issue(int money) {							//14. 메서드 호출됨
		this.myMoney += money;							//15. myMoney에 전달받은 매개변수 money(1500값) 누적
		int calticketCnt = money/price;					//16. 지역변수 calticketCnt 선언 후 구매자로부터 받은 금액만큼 티켓개수 계산
		this.ticketCnt-=calticketCnt;					//17. 멤버변수 ticketCnt에 calticketCnt만큼 차감
		return calticketCnt;							//18. calticketCnt값 전달
	}

	  @Override
	  public String toString() { 						//23.TicketSeller클래스 호출됨	
		return "매표원 [보유금액=" + myMoney + ", 티켓재고=" + ticketCnt + ", 티켓가격=" + price + "]";
	  }
	  
}

public class C15Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audience 관객 = new Audience(100000,0); //1. Audience 객체 생성 후 생성자 호출
		TicketSeller 매표원 = new TicketSeller(100000,10,15000); //5. TicketSeller 객체 생성 후 생성자 호출
		관객.reserve(매표원,15000); //10. 관객객체로 가서 reserve메소드 호출
		
		System.out.println(관객); //20.Audience클래스 호출
		System.out.println(매표원);//22.TicketSeller클래스 호출		
	}

}

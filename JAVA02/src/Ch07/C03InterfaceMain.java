package Ch07;

interface Remocan{
	
	
	void powerOn();		//추상메서드
	void powerOff();	//추상메서드
	
	int MAX_VOL=100;	//public static final
	int MIN_VOL=0;		//public static final
	void setVolumn(int vol);
}

interface Browser{
	void searchURL(String url);
}

class Tv implements Remocan{

	private int volumn;
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolumn(int vol) {
		if(MAX_VOL<vol)
			this.volumn=MAX_VOL;
		if(MIN_VOL>vol) {
			this.volumn=MIN_VOL;
		}else {
			this.volumn = vol;
		}
		
		System.out.println("TV 현재 볼륨 : " + this.volumn);
	}
	
}

class SmartTv extends Tv implements Browser{

	@Override
	public void searchURL(String url) {
		System.out.println(url+" 로 이동합니다. ");
	}
	
}


class Radio implements Remocan{

	private int volumn;
	
	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다");
	}

	@Override
	public void setVolumn(int vol) {
		
		System.out.println("라디오 현재 볼륨 : " + this.volumn);
	}
	
	
}


public class C03InterfaceMain {

	public static void TurnOn(Remocan remocan){ //Remocan remocan = tv
		remocan.powerOn();						//Remocan remocan = radio
	}
	public static void TurnOff(Remocan remocan){ //Remocan remocan = tv
		remocan.powerOff();						//Remocan remocan = radio
	}
	public static void ChangeVolumn(Remocan remocan,int vol) {
		remocan.setVolumn(vol);
	}
	public static void WebBrowser(Browser browser,String url ) {
		browser.searchURL(url);
	}
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTv smartTv = new SmartTv();
		
		//ON
//		TurnOn(tv);
//		TurnOn(radio);
		TurnOn(smartTv);
		
		//VOLUMN
//		ChangeVolumn(tv,50);
//		ChangeVolumn(radio,200);
//		
		ChangeVolumn(smartTv,50);
		
		//Browser
		WebBrowser(smartTv, "https://naver.com");
		
		
//		//OFF
//		TurnOff(tv);
//		TurnOff(radio);
		TurnOff(smartTv);
	}

}

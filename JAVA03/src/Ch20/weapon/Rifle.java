package Ch20.weapon;

import Ch20.unit.Unit;

public class Rifle extends Gun{

	public Rifle() {
		this.power = 50;
		this.curBuillitCnt=0;
		this.maxBuillitCnt=100;
	}
	@Override
	public void fire(Unit unit) {
		
		if(curBuillitCnt==0) {
			System.out.println("[경고] 재장전이 필요합니다");
			return ;
		}
		unit.underAttack(this.power);
		curBuillitCnt--;
		System.out.println("[정보] "+ unit.getType() + " 에게 "+this.power+" 만큼 피해를 입혔습니다. 현재HP :"+ unit.getHp() + "현재AMOR : " + unit.getAmor());
	}

	@Override
	public void reload(int bullit) {
		
		if(this.maxBuillitCnt>(bullit+this.curBuillitCnt))
			this.curBuillitCnt=maxBuillitCnt;
		else
			this.curBuillitCnt+=bullit;
		
		System.out.println("[정보] 재장전 완료");
	}


}

package Ch20.Building;

import Ch20.unit.Marine;
import Ch20.unit.Unit;

public class MarineGenerator implements UnitGenerator{

	@Override
	public Unit Gen() {
		return new Marine();
	}

	
}

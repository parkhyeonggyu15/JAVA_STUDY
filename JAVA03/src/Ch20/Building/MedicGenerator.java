package Ch20.Building;

import Ch20.unit.Medic;
import Ch20.unit.Unit;

public class MedicGenerator implements UnitGenerator{

	@Override
	public Unit Gen() {
		return new Medic();
	}

}

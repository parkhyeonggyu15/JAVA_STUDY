package Ch20.Building;

public abstract class Building {
	
	
	public int hp;
	public int sheld;
	public int ammor;
	public int isDestoryed;
	
	public Building() {};
	
	abstract void BuildStructure();
	public abstract void UnderAttack(int damage);
	
}

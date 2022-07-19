package textgame;

public class Armor<T> {
	
	T obj;
	Armor(T obj) { this.obj = obj;} // constructor
	public T getArmor() {return this.obj;}
}

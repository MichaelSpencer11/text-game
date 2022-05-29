package textgame;

public class Armor<T> {
	
	T obj;
	Armor(T obj) { this.obj = obj;} // constructor
	public T getObject() {return this.obj;}
}

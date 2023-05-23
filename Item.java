package textgame;

import java.util.ArrayList;

//there are items in the game, here are some attributes and stuff
public class Item{
		protected int itemId;
		protected static int itemTracker;
		protected String itemName;
		protected String description;
		protected String closeDescription;
		protected Room roomIn;
		protected boolean equipped;
		protected boolean plural;
		protected boolean takeable;
		protected boolean consumable;
		protected ArrayList<String> stolenFrom;
		protected ArrayList<Monster> morphedInto;
		protected int dropRate;
		protected boolean equippable;
		protected int gpValue;
		protected String type;

		protected int battlePower;
		protected int defense;
		protected int delay;
		protected int hitRate;
		protected String weight;


		
		public Item() {
			this.itemId = itemTracker++;
		}
		
		public Item(String name, boolean plural, String description, String desc2, Room room) {
			this.itemName = name;
			this.plural = plural;
			this.description = description;
			this.closeDescription = desc2;
			this.itemId = itemTracker++;
			this.roomIn = room;
			this.takeable = true;

			room.getInventory().add(this);

		}

		//copy constructor
		public Item(Item i){
			this.itemName = i.itemName;
			this.description = i.description;
			this.closeDescription = i.closeDescription;
			this.roomIn = i.roomIn;
			this.equipped = i.equipped;
			this.plural = i.plural;
			this.takeable = i.takeable;
			this.consumable = i.consumable;
			this.stolenFrom = i.stolenFrom;
			this.morphedInto = i.morphedInto;
			this.dropRate = i.dropRate;
			this.equippable = i.equippable;
			this.gpValue = i.gpValue;
			this.type = i.type;
			this.battlePower = i.battlePower;
			this.defense = i.defense;
			this.delay = i.delay;
			this.hitRate = i.hitRate;
			this.weight = i.weight;
		}

		public int getDropRate() {
			return this.dropRate;
		}
		
		public String getItemName() {
			return itemName;
		}

		public String getType(){
			return type;
		}
		public int getDelay() {
			return delay;
		}
		public int getBattlePower() {return battlePower;}
		public int getDefense(){return defense;}
		public int getHitRate(){return hitRate;}
		public String getWeight(){return weight;}
		public String getDescription() {
			return this.description;
		}
		
		public String getDesc2() {
			return this.closeDescription;
		}
		
		public String typeToString(){
			return this.getClass().toString().substring(6);
		}
		
		public void applyEffect(Character target){};

	}

package textgame;

import java.util.ArrayList;

//there are items in the game, here are some attributes and stuff
public abstract class Item {
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
		
		public Item() {
			
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

		public int getDropRate() {
			return this.dropRate;
		}
		
		public String getItemName() {
			return itemName;
		}
		
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

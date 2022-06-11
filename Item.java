package textgame;

import java.util.ArrayList;


//there are items in the game, here are some attributes and stuff
public class Item {
		protected int itemId;
		protected static int itemTracker;
		protected String itemName;
		protected String description;
		protected String closeDescription;
		protected Room roomIn;
		protected boolean equipped;
		protected boolean plural;
		protected boolean takeable;
		protected ArrayList<String> stolenFrom;
		protected ArrayList<Effect> effects;
		protected ArrayList<String> morphedInto;
		
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
		
		
		public void onEquip(Character character) {
			ApplyEffects.apply(effects, character);
			
		}
	}

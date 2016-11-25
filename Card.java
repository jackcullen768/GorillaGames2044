
public class Card {
	private static int card_id = 1;
	private String name;
	private int attractiveness;
	private int athleticism;
	private int intelligence;
	private double height;
	private int pintWorthy;
	

	public Card(String name, int attractiveness, int athleticism, int intelligence, double height, int pintWorthy) {
		super();
		card_id++;
		this.card_id = card_id;
		this.name = name;
		this.attractiveness = attractiveness;
		this.athleticism = athleticism;
		this.intelligence = intelligence;
		this.height = height;
		this.pintWorthy = pintWorthy;
	}

	

	public static int getCard_id() {
		return card_id;
	}



	public static void setCard_id(int card_id) {
		Card.card_id = card_id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return this.name +
				"	" + this.attractiveness + "	" + 
				this.athleticism + "	" + 
				this.intelligence + "	" + 
				this.height + "	" + 
				this.pintWorthy;
	}
	
	public int getAttractiveness() {
		return attractiveness;
	}


	public void setAttractiveness(int attractiveness) {
		this.attractiveness = attractiveness;
	}


	public int getAthleticism() {
		return athleticism;
	}


	public void setAthleticism(int athleticism) {
		this.athleticism = athleticism;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public int getPintWorthy() {
		return pintWorthy;
	}


	public void setPintWorthy(int pintWorthy) {
		this.pintWorthy = pintWorthy;
	}

	

}

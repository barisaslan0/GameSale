package Concrete;

public class Game {
	private int id;
	private String name;
	private double price;
	private String desciption;
	
	public Game() {
		
	}
	
	public Game(int id, String name, double price, String desciption) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.desciption = desciption;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
}

package model.domain;

public class BuyList {
	private int id;
	private String name;
	private int cost;
	private int point;
	private String buylist;

	public BuyList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuyList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public BuyList(int id, String name, int cost, int point, String buylist) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.point = point;
		this.buylist = buylist;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getBuylist() {
		return buylist;
	}

	public void setBuylist(String buylist) {
		this.buylist = buylist;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BuyList [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", point=");
		builder.append(point);
		builder.append(", buylist=");
		builder.append(buylist);
		builder.append("]");
		return builder.toString();
	}

}

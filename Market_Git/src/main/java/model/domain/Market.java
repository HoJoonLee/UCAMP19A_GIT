package model.domain;

public class Market {
	private int mcode;
	private String mname;
	private int price;
	private int quant;

	public Market() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Market(int mcode, String mname, int price, int quant) {
		super();
		this.mcode = mcode;
		this.mname = mname;
		this.price = price;
		this.quant = quant;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Market [mcode=");
		builder.append(mcode);
		builder.append(", mname=");
		builder.append(mname);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quant=");
		builder.append(quant);
		builder.append("]");
		return builder.toString();
	}
	
}

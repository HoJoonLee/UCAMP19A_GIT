package model.domain;

public class Deal {
	private int dnum;
	private String ddate;
	private int mcode;
	private int dquant;
	private int flag;

	public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deal(int dnum, int mcode, int dquant) {
		super();
		this.dnum = dnum;
		this.mcode = mcode;
		this.dquant = dquant;
	}

	public Deal(int dnum, String ddate, int mcode, int dquant, int flag) {
		super();
		this.dnum = dnum;
		this.ddate = ddate;
		this.mcode = mcode;
		this.dquant = dquant;
		this.flag = flag;
	}

	public int getDnum() {
		return dnum;
	}

	public void setDnum(int dnum) {
		this.dnum = dnum;
	}

	public String getDdate() {
		return ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}

	public int getDquant() {
		return dquant;
	}

	public void setDquant(int dquant) {
		this.dquant = dquant;
	}

	public int isFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [dnum=");
		builder.append(dnum);
		builder.append(", ddate=");
		builder.append(ddate);
		builder.append(", mcode=");
		builder.append(mcode);
		builder.append(", flag=");
		builder.append(flag);
		builder.append("]");
		return builder.toString();
	}

}

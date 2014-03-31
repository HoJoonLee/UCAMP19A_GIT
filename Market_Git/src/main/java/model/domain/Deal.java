package model.domain;

public class Deal {
	private int dnum;
	private String ddate;
	private int mcode;
	private boolean flag;

	public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deal(int dnum, String ddate, int mcode, boolean flag) {
		super();
		this.dnum = dnum;
		this.ddate = ddate;
		this.mcode = mcode;
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
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

package test1;

public class Mpoint {

	private Integer x;
	private Integer y;

	public Mpoint(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}


	@Override
	public int hashCode() {
		return x.hashCode()+y.hashCode();
	}

	@Override
	public boolean equals(Object obj) {// this obj
		if (this == obj)
			return true;
		if (obj instanceof Mpoint) {
			Mpoint p = (Mpoint) obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}

	@Override
	public String toString() {
		return "("+x+","+y+")";
	}

	// 重写equals()方法，签名与Object类必须一致

}

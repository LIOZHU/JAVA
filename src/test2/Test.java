package test2;

import test1.Mpoint;

public class Test {

	public static void main(String[] args) {

		Mpoint mp1 = new Mpoint(0, 0);
		Mpoint mp2 = new Mpoint(3, 4);

		Icalculate ical = (o1, o2) -> {
			if (o1 instanceof Mpoint && o2 instanceof Mpoint) {
				Mpoint p1 = (Mpoint) o1;
				Mpoint p2 = (Mpoint) o2;
				double dx = p1.getX() - p2.getX();
				double dy = p1.getY() - p2.getY();
				return Math.sqrt(dx * dx + dy * dy);
			}
			return 0;
		};

//				new Icalculate() {
//			
//			@Override
//			public double cal(Object o1, Object o2) {
//				//判断o1和o2是否相等
//				if(o1 instanceof Mpoint&&o2 instanceof Mpoint) {
//					Mpoint p1=(Mpoint)o1;
//					Mpoint p2=(Mpoint)o2;
//					double dx=p1.getX()-p2.getX();
//					double dy=p1.getY()-p2.getY();
//					return Math.sqrt(dx*dx+dy*dy);
//				}
//				return 0;
//			}
//		};
		System.out.println(ical.cal(mp1, mp2));// mpoint-->object向上转型
	}

}

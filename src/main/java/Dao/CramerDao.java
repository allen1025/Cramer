package Dao;

import model.Cramer;

public class CramerDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Object Calculationnormal(double a1, double a2, double a3, double b1, double b2, double b3, double c1,
			double c2, double c3, double d1, double d2, double d3) {
		
		double delta;
		double deltax;
		double deltay;
		double deltaz;
		delta = (a1 * b2 * c3) + (b1 * c2 * a3) + (c1 * a2 * b3) - (c1 * b2 * a3) - (a2 * b1 * c3) - (a1 * c2 * b3);
		deltax = (d1 * b2 * c3) + (b1 * c2 * d3) + (c1 * d2 * b3) - (c1 * b2 * d3) - (d2 * b1 * c3) - (d1 * c2 * b3);
		deltay = (a1 * d2 * c3) + (d1 * c2 * a3) + (c1 * a2 * d3) - (c1 * d2 * a3) - (a2 * d1 * c3) - (a1 * c2 * d3);
		deltaz = (a1 * b2 * d3) + (b1 * d2 * a3) + (d1 * a2 * b3) - (d1 * b2 * a3) - (a2 * b1 * d3) - (a1 * d2 * b3);
		if (delta == 0) {
			//System.out.println("無解或無限解");
			return null;
		} else {
			
			System.out.println("有解");
			
			double x= (deltax / delta);
			double y =( deltay / delta);
			double z =( deltaz / delta);
			/*System.out.println(x);
			System.out.println(y);
			System.out.println(z);*/
			
			Object[] l= new Object[] {new Double(x),new Double(y),new Double(z)};
			//new Cramer().setX(x);
			//new Cramer().setY(y);
			//new Cramer().setZ(z);
			/*System.out.println(l[0]);
			System.out.println(l[1]);
			System.out.println(l[2]);*/
			//System.out.println("x= " + x + "\n" + "y=" + y + "\n" + "z=" + z);
			return l;
		}

	}

	public Object Calculationdifferent(double a1, double a2, double a3, double b1, double b2, double b3, double c1,
			double c2, double c3, double d1, double d2, double d3) {
		
		double delta;
		double deltax;
		double deltay;
		double deltaz;
		delta = (a1 * b2 * c3) + (b1 * c2 * a3) + (c1 * a2 * b3) - (c1 * b2 * a3) - (a2 * b1 * c3) - (a1 * c2 * b3);
		deltax = (d1 * b2 * c3) + (b1 * c2 * d3) + (c1 * d2 * b3) - (c1 * b2 * d3) - (d2 * b1 * c3) - (d1 * c2 * b3);
		deltay = (a1 * d2 * c3) + (d1 * c2 * a3) + (c1 * a2 * d3) - (c1 * d2 * a3) - (a2 * d1 * c3) - (a1 * c2 * d3);
		deltaz = (a1 * b2 * d3) + (b1 * d2 * a3) + (d1 * a2 * b3) - (d1 * b2 * a3) - (a2 * b1 * d3) - (a1 * d2 * b3);
		if (delta == 0) {
			//System.out.println("無解或無限解");
			return null;
		} else {

			System.out.println("有解");
			double x = deltax / delta;
			double y = deltay / delta;
			double z = deltaz / delta;
			x = 1 / x;
			y = 1 / y;
			z = 1 / z;
			double[] l= {x,y,z};
			//System.out.println("x= " + x + "\n" + "y=" + y + "\n" + "z=" + z);
			return l;
		}

	}
}

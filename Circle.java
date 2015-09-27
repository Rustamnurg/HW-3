public class Circle {
    public static void main(String[] args) {		
		double r, x, y, d; //r - radius; d - distance
		x = Double.valueOf(args[0]);
		y = Double.valueOf(args[1]);
		r = Double.valueOf(args[2]);
		d = Math.sqrt(x * x + y * y);
		if (r < d)
		{
			System.out.println("Point out");
		} else {
			if (r > d) {
				System.out.println("Point in");
			} else {
				System.out.println("Point on");
			}
		}
	}
}

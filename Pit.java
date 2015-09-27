public class Pit {
    public static void main(String[] args) {
    	double t = Double.valueOf(args[0]);
    	double g, h;
    	g = 9.8;
    	h = g * t * t / 2;
    	System.out.println(h);
    }
} 

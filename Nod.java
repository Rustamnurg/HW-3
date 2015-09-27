public class Nod {
    public static void main(String[] args) {

    	int x1 = Integer.valueOf(args[0]);
    	int x2 = Integer.valueOf(args[1]);
    	int result, y, n1, n2;
    	result = 0;
    		if (x1 < x2){
    			y = x1;
    		} 
    		else{
    			y = x2;
    		}

    	for (int i = 1; i <= y; i++){
    		n1 = (x1 / i) * i;
    		n2 = (x2 / i) * i;
    		if ((n1 == x1) && (n2 == x2)){
    			result = i;
    		}
    	}
    	System.out.println(result);
    }
}

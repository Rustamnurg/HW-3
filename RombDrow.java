import java.util.Scanner;

class RombDrow{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

 
        int width, a;
        boolean d;
        d = true;    

        System.out.print("Введите ширину ромба: "); 
        width = in.nextInt();


        a = width / 2 + 1;
        while((d) || (a < width / 2)){
            if (d){
                a -= 1;
            } 
            else {
                a += 1;
            }
            for(int i = 0; i < width; i++){
                if (i < a){
                    System.out.print(" ");
                }
                else {
                    if (i >= width - a){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            if (a <= 0){
                d = false;
            }
            System.out.println("");
        }
    }
}

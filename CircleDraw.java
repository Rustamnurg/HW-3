import java.util.Scanner;

class CircleDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус: ");

        int r = in.nextInt(); 
        for (int i = 1; i <= 2 * r + 1; i++){
            for (int j = 1; j <= 2 * r + 1; j++){
                if ((i - r - 1) * (i - r - 1) + (j - r - 1) * (j - r - 1) <= r * r){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

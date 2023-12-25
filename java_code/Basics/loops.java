public class loops {
    public static void main(String[] args) {

        System.out.println("while loop");
        // while loop
        int i = 1;
        while(i<=4){
            System.out.println("Hi " + i);
            int j = 1; 
            while(j<=3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        System.out.println("\n do while loop");

        // do_while loop
        i = 5;
        do{
            System.out.println("Hi " + i );
            i--;
        }while(i>=1);


        System.out.println("\n For loop");

        // for loop
        for(i=0; i<=5; i++){
            System.out.println("Day " + i);
            for(int j = 1; j<=9; j++){
                System.out.println(" " + (j+8) + "  : " + (j+9));
            }
        }
        
    }
}

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int hangman = 5;
        
        
        String names[] = {"ant", "baboon", "badger", "bat", "bear","beaver",
            "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"};


        // get a random element from array
        String name = names[new Random().nextInt(names.length)];
        System.out.print("Random element from the array = "+ name + "\n"); 


        String dashes[] = new String[name.length()];

        String repeat[] = new String[name.length()];

        int sucess = name.length();

        for(int i=0; i<name.length(); i++){
        //    System.out.print("_ ");
 
           dashes[i] = "_";

           System.out.print(dashes[i] + " ");
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);

        // System.out.println(ch);
        
        while(hangman>0){

             

            System.out.print("Enter charecter : ");
            char ch = sc.next().charAt(0);

            int match = 0;
                // converts dashes to matched value
            for(int i=0; i<name.length();i++){  
                char c = name.charAt(i);  
               
                
                if(ch==c){

                        match++;
                        dashes[i] = String.valueOf(c);

                        repeat[i] = String.valueOf(c);

                        
                        
                        
                        sucess--;

                    }
                System.out.print(dashes[i] + " ");

            } 


            System.out.println();
            // System.out.println(match);
            System.out.println(sucess);

            if(match==0){
                hangman--;
            }

            if(hangman==0){
                System.out.println("You lost the game ");
                break;
            }

            if(sucess==0) {
                System.out.println("Congratulations you won !!");
                hangman=0;
            }
            
            if(hangman>0){
                System.out.println(hangman + " lives left ");
            }
            

            
        }



    }
}
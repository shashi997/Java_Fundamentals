public class ternary {
    public static void main(String[] args) {
        
        int x = 20;

        // ternary operator (?:)
        String result = x>18 ? "you can enter movie" : "under age";

        System.out.println(result);

        x = 5;

        // complex inside else part ternary 
        String result1 = x>18 && x<70 ? "You can Enter the movie" : x>70 ? "you are old" : "Under age";

        System.out.println(result1);

    }
}

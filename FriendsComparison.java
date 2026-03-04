import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Friend Names (Fixed Values)
        String friend1Name = "Amar";
        String friend2Name = "Akbar";
        String friend3Name = "Anthony";

        // User Inputs - Ages
        int friend1Age = input.nextInt();
        int friend2Age = input.nextInt();
        int friend3Age = input.nextInt();

        // User Inputs - Heights
        double friend1Height = input.nextDouble();
        double friend2Height = input.nextDouble();
        double friend3Height = input.nextDouble();

        // Finding Youngest
        String youngestFriendName;
        int youngestAge;

        if (friend1Age <= friend2Age && friend1Age <= friend3Age) {
            youngestFriendName = friend1Name;
            youngestAge = friend1Age;
        } else if (friend2Age <= friend1Age && friend2Age <= friend3Age) {
            youngestFriendName = friend2Name;
            youngestAge = friend2Age;
        } else {
            youngestFriendName = friend3Name;
            youngestAge = friend3Age;
        }

        // Finding Tallest
        String tallestFriendName;
        double tallestHeight;

        if (friend1Height >= friend2Height && friend1Height >= friend3Height) {
            tallestFriendName = friend1Name;
            tallestHeight = friend1Height;
        } else if (friend2Height >= friend1Height && friend2Height >= friend3Height) {
            tallestFriendName = friend2Name;
            tallestHeight = friend2Height;
        } else {
            tallestFriendName = friend3Name;
            tallestHeight = friend3Height;
        }

        // Output
        System.out.println("The youngest friend is " 
                + youngestFriendName 
                + " with age " 
                + youngestAge);

        System.out.println("The tallest friend is " 
                + tallestFriendName 
                + " with height " 
                + tallestHeight);

        input.close();
    }
}

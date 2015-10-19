import java.util.Scanner;
public class nopushPenguinActivity{

    public static void main(String[] args){
    
        String name;
        int numPenguinsMet;
        int numPenguinsLiked;
        double percentLiked;
        int numPenguinsInZoo=15;
        int estimatedPenguins;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
        System.out.println("Hi, "+name+", welcome to the zoo.\n We have a lot of animals, but the penguins are my favorite \n"+
                            "How many penguins have you seen before?");
        numPenguinsMet = keyboard.nextInt();
        System.out.println("Cool! How many of those "+ numPenguinsMet+" did you like?");
        numPenguinsLiked = keyboard.nextInt();
        percentLiked = ((double)numPenguinsLiked)/numPenguinsMet * 100;
        System.out.printf("Okay, so that means that you liked %d/%d penguins, which is %,.2f%%\n",numPenguinsLiked, numPenguinsMet, percentLiked);
        estimatedPenguins= (int)percentLiked*numPenguinsInZoo/100;
        System.out.println("We have "+numPenguinsInZoo+" penguins,\n so based on your past penguin appreciation, you should like about "+estimatedPenguins+"\nat this zoo");

    }



}
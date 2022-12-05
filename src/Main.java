import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome in Wiedzmin World!");
        System.out.println("Provide your name");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Provide the rank: ");
        String rank= scanner.nextLine();
        System.out.println("Provide the strength points: ");
        int strength_points= scanner.nextInt();
        System.out.println("Provide the number of points: ");
        int many_points= scanner.nextInt();
        System.out.println("Provide the type of the character, if new character(false), if old character (true) ");
        boolean type= scanner.nextBoolean();

        Wiedzmin properties= new Wiedzmin (name, rank, strength_points, many_points, type);

        properties.setName (name);
        properties.setRank (rank);
        properties.setStrength_points (strength_points);
        properties.setMany_points (many_points);
        properties.setType (type);

        System.out.println("You character details: ");
        System.out.println(properties.getName());
        System.out.println(properties.getRank());
        System.out.println(properties.getStrength_points());
        System.out.println(properties.getMany_points());
        if(properties.gettype()==true){
            System.out.println("old character");
        }else{
            System.out.println ("New character");
        }
        System.out.println("Hit Strength: "+properties.power());
    }

}

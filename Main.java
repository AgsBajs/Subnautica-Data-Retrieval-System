import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            boolean done = false;
            Scanner scnr = new Scanner(System.in);
            while(!done){


                System.out.println("Hello and Welcome to the Subautica Databook for Flora and Fauna!");
                System.out.println("\nThere are many different types of little creatures and looming plants in this game.");
                System.out.println("\nSearch for any of the animals or plants that you are trying to find information on.\n");
                System.out.print("Search: ");

                String user_input = scnr.nextLine();


                BufferedReader reader = new BufferedReader(new FileReader("DataBank.txt"));
                String line;

                boolean found = false;

                while((line=reader.readLine()) !=null)
                {
                    String[] parts = line.split(",");

                    String name = parts[1];

                    if(user_input.equalsIgnoreCase(name))
                    {
                        found = true;
                        String group = parts[0];
                        String classification = parts[2];
                        String category = parts[3];
                        String obtainableFrom = parts[4];
                        if(parts[0].equals("Fauna")){

                        
                            Databank data = new Fauna(group, name, classification, category, obtainableFrom);
                            System.out.println("\n" + data);
                        }
                        if(parts[0].equals("Flora")){

                            Databank data = new Flora(group,name,classification,category,obtainableFrom);
                            System.out.println("\n" + data);
                        }

                        
                    }
                }

                if(!found)
                {
                    System.out.println("The information provided is not in this Database or is too vague...\nNo Sign of: " + user_input);
                }
                reader.close();
            
                System.out.println("Would you like to Search again: (yes/no)");
                String choice = scnr.nextLine();
                
                if(!choice.equalsIgnoreCase("yes"))
                {
                    done = true;
                    System.out.println("Thank you for using this Databank for your Subnautica needs! \nCome again!");
                }

            }
            scnr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

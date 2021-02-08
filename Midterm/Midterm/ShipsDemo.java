import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ShipsDemo 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Ship> allShips = readAllShips("shipinfo.txt");
        System.out.println("------------------------------------------------");
        printShips(allShips);
        System.out.println("------------------------------------------------");
        ArrayList<Ship> sort = compare(allShips);
        printShips(sort);
        System.out.println("------------------------------------------------");
    }
  
    private static ArrayList<Ship> readAllShips(String fileName) throws FileNotFoundException
    {
        Scanner fileReader;
        ArrayList<Ship> ships = new ArrayList<>();       
        fileReader = new Scanner(new File("shipinfo.txt"));
        fileReader.nextLine();
        while(fileReader.hasNextLine())
        {
            String line = fileReader.nextLine().trim();
            String[] data = line.split(":");
            String name = data[0];
            String year = data[1].trim();
            String type = data[2].trim();
            if (type.compareTo("CargoShip") == 0)
            {
                int capacityOrCargo = Integer.parseInt(data[3].trim()); 
                ships.add(new CargoShip(name, year, capacityOrCargo)); 
            }                    
            else if (type.compareTo("CruiseShip") == 0)
            {
                int capacityOrCargo = Integer.parseInt(data[3].trim());
                ships.add(new CruiseShip(name, year, capacityOrCargo));                
            }
            else
            {
                 ships.add(new Ship(name, year));     
            }
               
        }
        fileReader.close();
        return ships;
    }
      
    private static void printShips(ArrayList<Ship> ships)
    {
        for(Ship ship : ships)
        {
            System.out.println(ship);
        }
    }
    
    public static ArrayList<Ship> compare(ArrayList<Ship> array) 
    {
        boolean sort = false;
        while (!sort) 
        {
            sort = true;
            for (int i = 0; i < array.size() - 1; i++) 
            {
                if((array.get(i).compareTo(array.get(i+1)) == -1))
                {
                    Ship temp = array.get(i + 1);
                    array.set(i+1,array.get(i));
                    array.set(i,temp);
                    sort = false;
                }
            }
        }
        return array;
    }        
}

//|=======================|//
//| hhs_apstract          |//
//|                       |//
//| shows knowledge of    |//
//| interfaces and        |//
//| abstract classes      |//
//|=======================|//

//|=================================================|//
//|Scratch-A-Bear inc.                              |//
//|                                                 |//
//|please visit:                                    |//
//|      http://www.scratch-a-bear.edu              |//
//|                                                 |//
//|Developers:                                      |//
//|      Vijaysrinivas Rajagopal                    |//
//|         https://github.com/MedicAlert           |//
//|      Lukas Marinovic                            |//
//|         https://github.com/LukasMMarinovic      |//
//|=================================================|//
import java.util.*;

public class Runner
{
   public static void main(String[] args)
   {
      System.out.println("Status of Scratch-A-Bear Shipping Co.");
      System.out.println("-----------------------------------");
      System.out.println();
      
      System.out.println();
 
 
      
      System.out.println("Transportation Status:");
      System.out.println("-----------------------------------");
      Truck truck = new Truck();
      Plane plane = new Plane();
      Ship ship = new Ship();
      
      truck.getNumVehicles();
      truck.getNumOperators();
      plane.getNumVehicles();
      plane.getNumOperators();
      ship.getNumVehicles();
      ship.getNumOperators();
      
   }
}
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
 
      System.out.println("Order Statuses:");
      System.out.println("-----------------------------------");
      
      ArrayList<CommonOrders> masterlist = new ArrayList<CommonOrders>();
      masterlist.add(new Packages("Teddy Bears", "priority", "28/2/2016", "Vijay Rajagopal", "1234 Fake Ln., Tennessee, U.S.", false));
      masterlist.add(new Packages("Nuclear Weapons", "standard", "28/3/2026", "Not-American_Government", "1232 Fake Ln., FakeState, SomeAsianCountry", false));
      masterlist.add(new Packages("Scuba Gear", "priority", "12/6/2016", "Alejandro Scroggs", "1234 Fake Ln., Mississippi, U.S.", true));
      masterlist.add(new Packages("Bear Whistle", "super-priority", "2/25/2016", "Lukas Marinovic", "1234 Fake Ln., Georgia, U.S.", true));
      masterlist.add(new Letters(true, "super-priority", "12/12/2016", "Lukas Marinovic and Vijay Rajagopal", "1234 Fake Ln., Georgia, U.S.", true));
      
      System.out.println("All active orders:");
      System.out.println();
      for(CommonOrders obj: masterlist)
      {
         System.out.println(obj);
         System.out.println();
      }

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
      
      System.out.println("Employee Status:");
      System.out.println("-----------------------------------");
      
      Boy boy = new Boy();
      Girl girl = new Girl();
      
      boy.getNumPeople();
      boy.getAverageAgePeople();
      girl.getNumPeople();
      girl.getAverageAgePeople();
   }
   
}
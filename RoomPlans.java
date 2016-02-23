import java.util.*;

public interface RoomPlans
{  
   public String getDesc();
   public String getImage();
   public String getItems();
   public String toString();
}

abstract class Room implements RoomPlans
{
   public String _desc = "";
   public ArrayList<String> items = new ArrayList<String>();
   public String ASCII_image = "";
      
   public String toNorth = "";
   public String toSouth = "";
   public String toEast = "";
   public String toWest = "";
   
   public String getDesc() { return _desc; }
   public String getImage() { return ASCII_image; }
   public String getItems() 
   {
      String responder = "| ";
      if(items.size() > 0)
      {
      for(String item: items)
         responder += item + " | ";
      }
      else{ responder = "[ No items in this room ]"; }    
      
      return responder;   
   }
   
   public String toString() 
   { 
      String responder = getImage() + "\n\n" + getDesc() + "\n" + getItems();
      return responder; 
   } 

}

class Lobby extends Room
{  
   private String sendOff()
   {
      String[] classes = {"English", "Math", "Biology", "Physics", "Latin"};
      int ran = (int)(Math.random() * classes.length);
      return classes[ran];
   }

   public Lobby()
   {
      _desc = "As you set foot into the building on a rainy day, you get a sense that things are... a bit off.\n"
      + "The lobby of the school is the same as it always was. There are large boards with shitty student art on it.\n"
      + "Students busy themselves along betwen the two main hallways of the school in order to get to class.\n"
      + "You stand in the corner awkwardly, thinking to yourself, \" Did I have any "
      + sendOff()
      +" homework?\"\n";
      
      toNorth = "";
      toSouth = "";
      toEast = "hallway_1";
      toWest = "hallway_2";
   }
}
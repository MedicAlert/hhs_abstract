import java.util.*;

interface RoomPlans
{  
   public String getDesc();
   public String getImage();
   public String getItems();
   public String toString();
}

class Room implements RoomPlans
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
   
   public void setDesc(String input){_desc = input;}
   public void setImage(String input){ASCII_image = input;}
   public void setDirection(String north, String south, String east, String west)
   {
      toNorth = north;
      toSouth = south;
      toEast = east;
      toWest = west;
   }
   
   public static String sendOff()
   {
      String[] classes = {"English", "Math", "Biology", "Physics", "Latin"};
      int ran = (int)(Math.random() * classes.length);
      return classes[ran];
   }
   
   public String toString() 
   { 
      String responder = getImage() + "\n\n" + getDesc() + "\n" + getItems();
      return responder; 
   } 

}

interface Hallway
{
   public ArrayList<Room> roomlist = new ArrayList<Room>();
}

class Environment 
{
   Room lobby = new Room();
   String _desc = "As you set foot into the building on a rainy day, you get a sense that things are... a bit off.\n"
      + "The lobby of the school is the same as it always was. There are large boards with shitty student art on it.\n"
      + "Students busy themselves along betwen the two main hallways of the school in order to get to class.\n"
      + "You stand in the corner awkwardly, thinking to yourself, \" Did I have any "
      + Room.sendOff()
      +" homework?\"\n";
   lobby.setDesc(_desc);
   lobby.setDirection("","","hallway_1", "hallway_1");
}
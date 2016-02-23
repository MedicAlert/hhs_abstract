import java.util.*;

public interface RoomPlans
{
   public String _desc = "";
   public ArrayList<String> items = new ArrayList<String>();
   public String ASCII_image = "";
   
   public void getDesc();
   public void getImage();
   public String toString();
   
   public String toNorth = "";
   public String toSouth = "";
   public String toEast = "";
   public String toWest = "";
}
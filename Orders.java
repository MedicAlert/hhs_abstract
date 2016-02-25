interface OrderPlan
{
   String getType();
   String getETA();
   String getName();
   String getAddress();
   boolean getCompletion();
   
   void setType(String input);
   void setETA(String input);
   void setName(String input);
   void setAddress(String input);
   void markComplete(boolean complete);
   
   String toString();   
}

abstract class CommonOrders implements OrderPlan
{
   public String orderType; //priority or standard
   public String ETA; //DD/MM/YY
   public String name; //name of recipent
   public String address; //address of recipent
   public boolean isComplete; //has reached
   
   public String getType(){return orderType;}
   
   public String getETA(){return ETA;}
   
   public String getName(){return name;}
   
   public String getAddress(){return address;}
   
   public boolean getCompletion(){return isComplete;}
   
   public void setType(String input){ orderType = input; }
   public void setETA(String input){ ETA = input; }
   public void setName(String input){ name = input; }
   public void setAddress(String input){ address = input; }
   public void markComplete(boolean complete){ isComplete = complete; }
}

class Packages extends CommonOrders
{
   private String subject;
   
   public Packages(String subject, String type, String ETA, String name, String address, boolean complete)
   {
      this.subject = subject;
      orderType = type;
      this.ETA = ETA;
      this.name = name;
      this.address = address;
      isComplete = complete;
   }
   
   public String getSubject(){return subject;}
   public void setSubject(String input) {subject = input;}
   public String toString()
   {
      String returner = getName() + "'s package details:\n Package Name: " + getSubject() + "\n Order Type: " + getType() + "\n ETA: " + getETA() + "\n Address: " + getAddress() + "\n Has Reached: " + getCompletion();
      return returner;
   }
}

class Letters extends CommonOrders
{
   private boolean isPersonal = false;
   private ArrayList<CommonOrders> masterlist = new ArrayList<CommonOrders>();
   
   public Letters(boolean personal, String type, String ETA, String name, String address, boolean complete)
   {
      isPersonal = personal;
      orderType = type;
      this.ETA = ETA;
      this.name = name;
      this.address = address;
      isComplete = complete;
   }
   
   public boolean getPersonal(){return isPersonal;}
   public void setPersonal(boolean personal) {isPersonal = personal;}
   
   public String toString()
   {
      String returner = getName() + "'s package details:\n Is it a personal letter: " + getPersonal() + "\n Order Type: " + getType() + "\n ETA: " + getETA() + "\n Address: " + getAddress() + "\n Has Reached: " + getCompletion();
      return returner;
   }
}
interface OrderPlan
{
   void getOrders();
   
   String getType();
   String getETA();
   String getName();
   String getCompletion();
   
   void setType(String input);
   void getETA(String input);
   void getName(String input);
   
   String toString();   
}
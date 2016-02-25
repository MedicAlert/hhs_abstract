//Alejandro Scroggs

abstract class People
{
   
   abstract void getNumPeople();
   
   abstract void getAverageAgePeople();

}

class Boy extends People
{
   int age = 34;
   int numOfPeople = 84;
   
   public void getNumPeople()
   {
      System.out.println("Number of males: " + numOfPeople);
   }
   
   public void getAverageAgePeople()
   {
      System.out.println("Average age of males: " + age);
   }

}

class Girl extends People
{
   int age = 37;
   int numOfPeople = 69;
   
   public void getNumPeople()
   {
      System.out.println("Number of females: " + numOfPeople);
   }
   
   public void getAverageAgePeople()
   {
      System.out.println("Average age of females: " + age);
   }
}


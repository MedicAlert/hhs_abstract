//Lukas Marinovic

//Abstract class
abstract class Transport
{
abstract void getNumVehicles();

abstract void getNumOperators();
}


class Truck extends Transport
{

int numTrucks = 45;
int numDrivers = 40;

public void getNumVehicles()
{
System.out.println(numTrucks + " Trucks");
}

public void getNumOperators()
{
System.out.println(numDrivers + " Drivers");
}

}



class Plane extends Transport
{

int numPlanes = 15;
int numPilots = 30;

public void getNumVehicles()
{
System.out.println(numPlanes + " Planes");
}

public void getNumOperators()
{
System.out.println(numPilots + " Pilots");
}

}



class Ship extends Transport
{

int numShips = 8;
int numSailors = 43;

public void getNumVehicles()
{
System.out.println(numShips + " Ships");
}

public void getNumOperators()
{
System.out.println(numSailors + " Sailors");
}

}



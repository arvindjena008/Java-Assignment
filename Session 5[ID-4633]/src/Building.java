public class Building {
      String BuildingName;
      String BuildingPlace;
      public Building(String BuildingName, String BuildingPlace)  
      {
  		this.BuildingName = BuildingName;
  		this.BuildingPlace = BuildingPlace;
  	  }
      void Display()
      {
    	  System.out.println("BuildingName = "+BuildingName);
    	  System.out.println("BuildingPlace = "+BuildingPlace);
      }
}

package SolarSystem;

public class main {
  public static void main (String[]args){

      solarSystemBasics solarsys= new solarSystemBasics();

      solarsys.Sun="1";
      solarsys.Moon="2";
      solarsys.Planets="2";
      solarsys.Stars="10";

    //  **************FeatureSun**************

      FeatureSun sun = new FeatureSun();
      sun.name="panther";
      sun.color= "black";
      sun.temp="-1223124kelvin";


  }
}

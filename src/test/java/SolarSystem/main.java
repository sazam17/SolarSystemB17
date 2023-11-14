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

<<<<<<< HEAD
      //******Planet2*********

      Planet2 xaros= new Planet2();
      xaros.name="nehaio";
      xaros.color="blue";
      xaros.size ="323432234km";


=======
//*************Planet1********
      Planet1 plato = new Planet1();
      plato.color="green";
      plato.name="abracadabra";
      plato.radius="800000km";
      plato.temp="10000000k";
>>>>>>> FeaturePlanet1
  }
}

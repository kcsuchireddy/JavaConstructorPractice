package love.programming;
public class Country
{
    private String countryName;
    private int noOfPopulation;
    private String continentName;
    private int gdpValue;

    public Country()
    {
       System.out.println("this is a no argument constructor");
    }
    public Country(String countryName){
        this.countryName = countryName;
        System.out.println("this ccountryName is " + countryName);
    }

    public Country(String countryName, int noOfPopulation) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        System.out.println("this country name is " + countryName + "this country population is" + noOfPopulation);
    }

    public Country(String countryName, int noOfPopulation, String continentName) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
        System.out.println("this countryName is " + countryName + noOfPopulation + continentName);
    }

    public Country(String countryName, int noOfPopulation, String continentName, int gdpValue){
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
        this.gdpValue = gdpValue;
        System.out.println("this countryName is " + countryName + noOfPopulation + continentName + gdpValue);
    }

    //4 class variables countryName, noOfPopulation, continentName, gdpValueOfCountry.
}

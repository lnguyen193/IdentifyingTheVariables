/*
You are traveling multiple countries overseas on vacation
and want to write a letter to you parents in the states.
In that letter, you would like to give them details about the country you're visiting.
Declare variables to include the Name of the country you're visiting, Population(Number) ,
Capital city,  and what $1 is worth there (Currency).

Output:
Hey Mom and Dad!
Here are some interesting details about the first country I'm visiting.
Name: Kenya
Population Size: 49.7 million
Capital: Nairobi
Currency: One U.S Dollar equals $103.84 Kenyan Shillings!!
I'm so excited to visit the Nairobi Nation Park and feel the giraffes!!
Talk later.
*/
public class IdentifyVariables {
    public static void main(String[] args) {
    //write my code here
    String countryNam = "Viet Nam";
    double population = 97.3;
    String capitalCity = "Ha Noi";
    double currency = 23174.50;

        System.out.println("Hey Mom and Dad!\nHere are some interesting details about the first country I'm visiting.");
        System.out.println("Name: " + countryNam);
        System.out.println("Population size: " + population + " million");
        System.out.println("Capital: " + capitalCity);
        System.out.println("Currency: One U.S Dollar equals " + currency + " Vietnamese dong");
        System.out.println("I'm so excited to visit the other famous areas in the Southern Viet Nam\nTalk later.");
    }
}

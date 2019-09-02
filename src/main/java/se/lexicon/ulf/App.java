package se.lexicon.ulf;

import se.lexicon.ulf.models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Person anyone = new Person("Ulf", "Bengtsson", 37);
        Person anotherOne = new Person("Erik","Svensson",42);

        Person[] peopleList = {anotherOne, anyone};

        //boolean status = anyone.setFirstName("Ulf");

        for (Person one : peopleList)
        {
            if (one.isReady()) {
                one.gretting();
            }
            else {
                System.out.println("Name not valid!");
            }
        }


        //anotherOne.gretting();
    }
}

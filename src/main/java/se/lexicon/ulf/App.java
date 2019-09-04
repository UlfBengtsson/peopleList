package se.lexicon.ulf;

import se.lexicon.ulf.models.Person;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        menu();

    }

    private static void menu()
    {
        Person[] peopleList = new Person[5];
        int listCounter = 0;
        boolean keepLooping = true;
        Person selectedPerson = null;

        while (keepLooping) {
            int selection = askUserForNumber("Select");

            switch (selection) {
                case 1:
                    if (listCounter < 5) {
                        peopleList[listCounter] = addPerson();
                        listCounter++;
                    } else {
                        System.out.println("List is full, not able too add more people.");
                    }
                    break;
                case 2:
                    printListOfPeople(peopleList, listCounter);
                    break;
                case 3:
                    selectedPerson = selectPerson(peopleList, listCounter);
                    break;
                case 9:
                    keepLooping = false;
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Incorrect selection!");
                    break;
            }

        }
    }

    private static Person selectPerson(Person[] people, int counter) {
        printListOfPeople(people,counter);
        int indexOfPerson = askUserForNumber("Number") - 1;
        return people[indexOfPerson];
    }

    private static void printListOfPeople(Person[] people, int counter)
    {
        if (counter == 0)
        {
            System.out.println("List is empty");
        }
        else
        {
            for (int index = 0; index < counter; index++)
            {
                System.out.println(index +1 + ": " + people[index]);
            }
        }

    }

    private static Person addPerson() {
        Person person = new Person(
                askUserFor("First Name"),
                askUserFor("Last Name"),
                askUserForNumber("Age")
        );
        return person;
    }

    public static String askUserFor(String name)
    {
        System.out.print("Pleace enter " + name + ": ");
        String inputFromUser = scanner.nextLine();

        return inputFromUser;
    }

    public static int askUserForNumber(String name)
    {
        int number = Integer.parseInt(askUserFor(name));
        return number;
    }
}

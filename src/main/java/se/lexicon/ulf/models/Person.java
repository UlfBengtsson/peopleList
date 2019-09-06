package se.lexicon.ulf.models;

public class Person {
    // Fields = state
    private String firstName;
    private String lastName;
    private int age;
    private boolean adult;
    private boolean ready;

    //Constructors
    public Person(String firstName, String lastName, int age)
    {
        this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        checkDataOfPerson();
    }

    private Person() {
        adult = false;
        ready = false;
    }

    //Behavior
    public void gretting() {
        System.out.println("Hello my name is " + firstName +
                            " " + lastName +
                            " and im " + age + " years old");
    }

    public void detailInfo()
    {
        System.out.println("-- Detail Information --\nFirst name: " + (firstName != null ? firstName : "") +
                "\nLast name: " + (lastName != null ? lastName : "") +
                "\nAge: " + age +
                "\nAdult: " + (adult ? "Yes" : "No") +
                "\nReady: " + (ready ? "Complete" : "Incomplete"));
    }

    //Getters and Setters
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        firstName = firstName.trim();
        if (cheakName(firstName)) {
            //Field         //Local variable
            this.firstName = firstName;
            checkDataOfPerson();
        }

    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        lastName = lastName.trim();
        if (cheakName(lastName)) {
            //Field         //Local variable
            this.lastName = lastName;
            checkDataOfPerson();
        }
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >= 0 )
        {
            this.age = age;

            if (age >= 18)
            {
                adult = true;
            }
            else
            {
                adult = false;
            }
        }
    }

    public boolean isAdult()
    {
        return adult;
    }

    public boolean isReady() {
        return ready;
    }

    private boolean cheakName(String name)
    {
        if (name != null)
        {
            if (name.length() > 1) {
                return true;
            }
        }
        return false;
    }

    private void checkDataOfPerson()
    {
        if(!cheakName(firstName))
        {
            ready = false;
            return;
        }
        if (!cheakName(lastName))
        {
            ready = false;
            return;
        }
        ready = true;
    }

    @Override
    public String toString()
    {
        return (firstName != null ? firstName : " ") + " " + (lastName != null ? lastName : "");
    }
}

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
        if (this.setFirstName(firstName) && this.setLastName(lastName))
        {
            ready = true;
        }

        this.setAge(age);
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

    //Getters and Setters
    public String getFirstName()
    {
        return firstName;
    }
    public boolean setFirstName(String firstName)
    {
        firstName = firstName.trim();
        if (cheakName(firstName)) {
            //Field         //Local variable
            this.firstName = firstName;
            return true;
        }
        return false;
    }
    public String getLastName()
    {
        return lastName;
    }
    public boolean setLastName(String lastName)
    {
        lastName = lastName.trim();
        if (cheakName(lastName)) {
            //Field         //Local variable
            this.lastName = lastName;
            return true;
        }
        return false;
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
        if (name.length() > 1) {
            return true;
        }
        return false;
    }
}

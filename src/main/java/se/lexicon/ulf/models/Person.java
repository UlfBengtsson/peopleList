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
        ready = this.setFirstName(firstName);
        this.lastName = lastName;
        this.age = age;
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
        if (firstName.length() > 1) {
            //Field         //Local variable
            this.firstName = firstName;
            return true;
        }
        return false;
    }

    public boolean isReady() {
        return ready;
    }
}

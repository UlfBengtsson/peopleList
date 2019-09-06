package se.lexicon.ulf;

import org.junit.Test;
import se.lexicon.ulf.models.Person;

import static org.junit.Assert.*;

public class PersonTest
{
    @Test
    public void createPersonTest()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",18);

        //Assert
        assertNotNull(person);
    }

    @Test
    public void Adult18()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",18);

        //Assert
        assertTrue(person.isAdult());
    }
    @Test
    public void Adult91()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",91);

        //Assert
        assertTrue(person.isAdult());
    }
    @Test
    public void NotAdult17()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",17);

        //Assert
        assertFalse(person.isAdult());
    }
    @Test
    public void NotAdult1()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",1);

        //Assert
        assertFalse(person.isAdult());
    }
    @Test
    public void ChangeAgeWorks()
    {
        //Arrange
        Person person = new Person("test","testing",0);

        //Act
        person.setAge(18);

        //Assert
        assertEquals(18, person.getAge());
    }
    @Test
    public void BadChangeAgeDoseNotWork()
    {
        //Arrange
        Person person = new Person("test","testing",0);

        //Act
        person.setAge(-18);

        //Assert
        assertEquals(0, person.getAge());
    }
    @Test
    public void BecomeAdult17To18()
    {
        //Arrange
        Person person = new Person("test","testing",17);

        //Act
        person.setAge(18);

        //Assert
        assertTrue(person.isAdult());
    }
    @Test
    public void NotAdult18To17()
    {
        //Arrange
        Person person = new Person("test","testing",18);

        //Act
        person.setAge(17);

        //Assert
        assertFalse(person.isAdult());
    }

    @Test
    public void ConstructorBadAgeDoseNotWork()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("test","testing",-1);

        //Assert
        assertEquals(0, person.getAge());
    }
    @Test
public void ConstructorLongEnoughFirstName()
{
    //Arrange
    Person person;

    //Act
    person = new Person("Bo","",0);

    //Assert
    assertEquals("Bo", person.getFirstName());
}
    @Test
    public void ConstructorNotLongEnoughFirstName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("B","",0);

        //Assert
        assertNull(person.getFirstName());
    }
    @Test
    public void ConstructorEmptyFirstName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("","",0);

        //Assert
        assertNull(person.getFirstName());
    }
    @Test
    public void ConstructorLongEnoughLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("","Pe",0);

        //Assert
        assertEquals("Pe", person.getLastName());
    }
    @Test
    public void ConstructorNotLongEnoughLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("","P",0);

        //Assert
        assertNull(person.getLastName());
    }
    @Test
    public void ConstructorEmptyLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("","",0);

        //Assert
        assertNull(person.getLastName());
    }
    @Test
    public void ConstructorNotLongEnoughFirstAndLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("B","P",0);

        //Assert
        assertNull(person.getFirstName());
        assertNull(person.getLastName());
    }
    @Test
    public void ConstructorLongEnoughFirstAndLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("Bo","Pe",0);

        //Assert
        assertEquals("Bo",person.getFirstName());
        assertEquals("Pe",person.getLastName());
    }
    @Test
    public void ConstructorDataReadyTrue()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("Bo","Pe",0);

        //Assert
        assertTrue(person.isReady());
    }
    @Test
    public void ConstructorDataReadyFalseFirstName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("B","Pe",0);

        //Assert
        assertFalse(person.isReady());
    }
    @Test
    public void ConstructorDataReadyFalseLastName()
    {
        //Arrange
        Person person;

        //Act
        person = new Person("Bo","P",0);

        //Assert
        assertFalse(person.isReady());
    }
    /* test template
    @Test
    public void Test()
    {
        //Arrange


        //Act


        //Assert

    }
    */
}

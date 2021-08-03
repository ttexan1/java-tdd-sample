package junit.tryal;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
  String personName = "Bob";
  int personAge = 21;

  @Test
  public void testCreatePersonWithNameAndAge() {
    Person p = new Person(personName, personAge);
    assertEquals(personName, p.getName());
    assertEquals(personAge, p.getAge());
  }

  @Test
  public void testConstants() {
    assertEquals(Person.MINIMUM_AGE, 1);
    assertEquals(Person.MAXIMUM_AGE, 200);
  }

  @Test(expected = AgeBelowMinimumException.class)
  public void testConstructorThrowsExceptionWhereAgeBelowMinimum() {
    Person p = new Person(personName, Person.MINIMUM_AGE - 1);
  }
}

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
}

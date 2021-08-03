package junit.tryal;

public class Person {
  public static final int MINIMUM_AGE = 1;
  public static final int MAXIMUM_AGE = 200;
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

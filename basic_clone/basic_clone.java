package java_rps;

import java.util.*;

public class basic_clone implements Cloneable {
  public static void main(String[] args) {

    Human h = new Human(17, "ram");
    Human d = new Human(h);

    d.age = 33;

    System.out.println("age =" + h.age);
    System.out.println("name " + h.name);
    System.out.println();
    System.out.println("age =" + d.age);
    System.out.println("name " + d.name);

  }
}

class Human {

  int age;
  String name;

  Human(int age, String name) {
    this.age = age;
    this.name = name;

  }

  Human(Human obj) {
    this.age = obj.age;
    this.name = obj.name;

  }

}

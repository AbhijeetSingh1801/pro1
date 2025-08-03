package MyPackage;

// File: Student.java
public class Student {
  int id;
  String n;

  // Added constructor to initialize both fields
  public Student(int id, String n) {
    this.id = id;
    this.n = n;
  }

  @Override
  public String toString() {
    return "HII From Students";
  }
}

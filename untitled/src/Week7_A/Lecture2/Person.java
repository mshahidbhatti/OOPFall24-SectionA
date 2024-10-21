package Week7_A.Lecture2;

public class Person {
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public void display() {
        System.out.println("Name: " + name + ", Email: " + email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return String.format("Name:, %s Email:%s", name, email);
    }
}

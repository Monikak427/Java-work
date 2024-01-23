package objectarrays;

import java.util.Objects;

public class Person {
    private double height;
    private double weight;
    private String ssn; 
    private String phoneNumber;


    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(ssn, person.ssn);
    }

    public static void main(String[] args) {
    
        Person person1 = new Person(160.0, 60.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(190.0, 85.0, "987-65-4321", "987-654-3210");

        boolean areEqual = person1.equals(person2);
        System.out.println("Persons are equal based on SSN: " + areEqual);
    }
}

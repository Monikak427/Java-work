public class Student {
    private String name = "Monika";
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name:"+s.getName());
    }
}


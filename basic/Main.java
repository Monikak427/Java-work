public class Main {
    public static void main(String[] args) {
        Department department = new SubDepartment(200);
        System.out.println("Department Size: " + department.getDepartmentSize());
        Product product = new Product();
        product.setPrice(50.0);
        System.out.println("Price for 10 quantities: $" + product.getPrice(10));
    }
}


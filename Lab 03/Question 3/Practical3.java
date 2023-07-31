public class Practical3 {

    public static void main(String[] args) {
         Employee e1=new Employee();
        //set the values
        e1.setName("Naveen");
        e1.setAge(23);
        e1.setSalary(45000.00);

        //display the values
        String a= e1.getName();
        int b= e1.getAge();
        double c= e1.getSalary();

        System.out.println("Name is:" +a);
        System.out.println("Age is:" +b);
        System.out.println("Salary is:"+c);
    }
}
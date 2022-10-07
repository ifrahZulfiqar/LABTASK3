public class Driver {
    public static void main(String[] args) {
        Employee obj = new Employee("john", "erwfreyuk", "janitor");
        Employee obj2 = new Employee(obj);
        Pc obj1 = new Pc("fgghj" , "dell" , "fgghj" , 4 , 5);
        Pc obj3 = new Pc(obj1);

        System.out.println(obj1.equals(obj3));
    }

}

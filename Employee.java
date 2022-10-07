public class Employee {
    private String name;
    private String id;
    private String designation;

    public  Employee (  String name , String id , String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public Employee(Employee employee){
        this.name = employee.name;
        this.id = employee.id;
        this.designation = employee.designation;
    }
    

    public void setname(String name){
           this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setid(String id){
        this.id = id;
    }

    public String getid(){ 
        return id;
    }

    public void setdesignation(String designation){
        this.designation = designation;
    }

    public String getdesignation(){
        return designation;
    }

    public String  tostring(){
        return String.format("NAME:%s\nID:%s\nDESIGNATION:%s" , name , id , designation);
    }

    public boolean equals(Object o){
        Employee temp = (Employee)o;

        if(temp.name == this.name && temp.id == this.id && temp.designation == this.designation){
            return true;
        }
        else{
            return false;
        }
    }
}


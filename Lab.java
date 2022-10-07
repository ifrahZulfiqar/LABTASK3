public class Lab {
    private String name;
    private Employee labAttendant;
    private Pc computers[] = new Pc[50];

    public Lab(String name , Employee labAttendant , Pc computers[]){
        this.name = name;
        this.labAttendant = labAttendant;
        this.computers = computers;
    }

    public Lab(Lab lab){
        this.name = lab.name;
        this.labAttendant = lab.labAttendant;
        this.computers = lab.computers;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setlabAttendant(Employee labAttendant){
        this.labAttendant = labAttendant;
    }

    public Employee getlabAttendant(){
        return labAttendant;
    }

    public void setcomputers(Pc computers[]){
        this.computers = computers;
    }

    public Pc[] getcomputers(){
        return computers;
    }

    public String tostring(){
        return String.format("name:%s\nlab attendant:%s" , name , labAttendant);
    }
}

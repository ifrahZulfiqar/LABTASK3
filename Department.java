public class Department {
    String name;
    Employee hodName;
    Employee labincharge;
    Lab lab[] = new Lab[10];

    public Department (String name , Employee hodName , Employee labincharge , Lab lab[]){
        this.name = name;
        this.hodName = hodName;
        this.labincharge = labincharge;
        this.lab = lab;
    }
     
    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void sethodName(Employee hodName){
        this.hodName = hodName;
    }

    public Employee gethodName(){
        return hodName;
    }

    public void setlabincharge(Employee labincharge){
        this.labincharge = labincharge;
    }

    public Employee getlabincharge(){
        return labincharge;
    }

    public void setlab(Lab lab[]){
        this.lab = lab;
    }

    public Lab[] getlab(){
        return lab;
    }
}

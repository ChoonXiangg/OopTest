package ie.atu;

public class Employee {
    private String name;
    private String pps;
    private String employment;
    private String gender;
    private int age;
    public Employee(String name,String pps,String employment,String gender,int age){
        if(name.length()<3){
            System.out.println("Name must be more than 3 characters");
        }
        else if(name.length()>25){
            System.out.println("Name must be less than 25 characters");
        }
        if(pps.length()!=11){
            System.out.println("Invalid PPS ID");
        }
        if(employment!="Full time"&&employment!="Part time"&&employment!="Contract"){
            System.out.println("Invalid employment type");
        }
        if(gender!="Man"&&gender!="Woman"&&gender!="Non binary"){
            System.out.println("Invalid gender");
        }
        if(age<=16){
            System.out.println("Age must be over 16");
        }
        else if(age>=66){
            System.out.println("Age must be under 66");
        }
        else{
            this.name=name;
            this.pps=pps;
            this.employment=employment;
            this.gender=gender;
            this.age=age;
        }
        System.out.println();
    }
    public void getEmployee(){
        System.out.println("Name: "+name);
        System.out.println("PPS ID: "+pps);
        System.out.println("Employment Type: "+employment);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
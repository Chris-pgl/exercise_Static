public class Employee {

    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName,String newEmployeeSurname,String newEmployeeAddress){
        this.setName(newEmployeeName);
        this.setSurname(newEmployeeSurname);
        this.setAddress(newEmployeeAddress);
    }

    public void getEmployeeDetails(){
        System.out.println("Name: "+ getName() +" Surname: "+ getSurname() +" Address: "+ getAddress());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

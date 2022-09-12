public class Employee {
    private final String nameFullFio;
    private int department;
    private double salary;
    private static int counter = 0;
    private final int id;

    public Employee ( String nameFullFio , int department , double salary){
        this.nameFullFio = nameFullFio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {return id;}

    public String getNameFull() {return nameFullFio;}

    public int getDepartment () {return department;}

    public int getSalary () {return (int) salary;}


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary){this.salary = salary;}

    @Override
    public String toString() {
        return
                " ФИО= " + nameFullFio + '\'' +
                        " Отдел= " + department +
                        " Зарплата= " + salary +
                        " (id)= " + id ;
    }
}


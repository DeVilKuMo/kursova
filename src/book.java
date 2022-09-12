public class book {

    private final Employee[] employees;

    public book(int size) {
        employees = new Employee[size];
    }

    public boolean add(Employee employee) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }public void employeeData() {
        System.out.println("Данные сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }public void MaxSalary() {
        int maxSalary = -1;
        Employee maxxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxxSalary = employee;
            }
        }
        if (maxxSalary != null) {
            System.out.println("Сотрудник с максимальная зарплата: " + maxxSalary.getNameFull());
        }
    }public void MinSalary() {
        int minSalary = employees[0].getSalary();

        Employee minnSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minnSalary = employee;
            }
        }
        if (minnSalary != null) {
            System.out.println("Сотрудник с минимальная зарплата: " + minnSalary.getNameFull());
        }
    }public void averageSalary() {
        float sum = 0;
        int count = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
                count++;
            }
        }
        float mean = sum / count;
        System.out.println("Средняя зарплата сотрудников: " + mean + " рублей.");
    }
    public void listEmployees() {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getNameFull() + ".");
            }
        }
    }

}
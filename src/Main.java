public class Main {

    public static void main(String[] args) {
        book book1 = new book(10);
        book1.add(new Employee("Глушков Максим Александрович", 1, 5000));
        book1.add(new Employee("Сумцов Влад Владимирович", 1, 500));
        book1.add(new Employee("Карпов Миша Владимирович", 1, 5800));
        book1.add(new Employee("Стрыжак Сергей Васильевич", 1, 9000.50));
        book1.add(new Employee("Глушкова Мария Владимировна", 1, 500000));
        System.out.println();
        book1.employeeData();
        System.out.println();
        book1.MaxSalary();
        book1.MinSalary();
        book1.averageSalary();
        System.out.println();
        book1.listEmployees();
    }

}
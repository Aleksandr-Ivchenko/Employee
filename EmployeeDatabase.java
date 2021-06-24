public class EmployeeDatabase {
    public static void main(String[] args) {
        Employee[] Employee = new Employee[5];
        Employee[0] = new Employee("bassbam", "Dmitr",
                "Vladim", "Engineer", "bas@mail.ru",
                "89067407474", 95000, 34);
        Employee[1] = new Employee("Sorov", "Michail",
                "Mikhailovich", "locksmith", "misha@mail.ru",
                "89069596524", 55000, 50);
        Employee[2] = new Employee("Smalko", "Yuriy",
                "Ivanovich", "locksmith", "shmal@mail.ru",
                "89036542585", 55000, 55);
        Employee[3] = new Employee("Kozelsky", "Aleksey",
                "Nikolaevich", "locksmith", "koz@mail.ru",
                "89035692101", 60000, 75);
        Employee[4] = new Employee("Lisiutkin", "Roman",
                "Viktorovich", "locksmith", "lis@mail.ru",
                "89018526532", 45000, 29);

        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i].age > 40){
                Employee[i].printInfo();
                System.out.println();
                System.out.println();
            }
        }
    }
}
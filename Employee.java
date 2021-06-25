




public class Employee {
     static String type = "Employee";
     String lastName;
     String firstName;
     String patronymic;
     String post;
     String eMail;
     String phoneNumber;
     int wages;
     int age;


    public Employee(String lastName, String firstName, String patronymic,
                    String post, String eMail, String phoneNumber, int wages, int age){
        this.lastName = lastName;
        this.firstName =firstName ;
        this.patronymic =patronymic;
        this.post =post;
        this.eMail =eMail;
        this.phoneNumber =phoneNumber;
        this.wages =wages;
        this.age =age;
    }
// 
    public void printInfo() {System.out.printf("Employee:\n lastName - %s,\n firstName - %s,\n" +
                    " patronymic - %s,\n post - %s, \n eMail - %s,\n" +
                    " phoneNumber - %s,\n wages - %d,\n age - %d", this.lastName,
            this.firstName, this.patronymic, this.post, this.eMail,
            this.phoneNumber, this.wages, this.age);
    }
}

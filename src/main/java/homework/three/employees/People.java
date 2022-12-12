package homework.three.employees;

public class People {
    public static void main(String[] args) {
        Employees[] peoples=new Employees[]{
                new Employees("Rifat Ismailov","Engineer","refaazer@gmail.com","+380666666666",32),
                new Employees("Max Ibragimov","Engineer","max23511@gmail.com","+380666777777",28),
                new Employees("Alex Popov","Engineer","alxpop23@gmail.com","+380677776666",30),
                new Employees("Natasha Sgaydachna","Secretary","natsgay1995@gmail.com","+380665567666",25)
        };
        for (Employees employees:peoples){
            System.out.println(employees);
        }
    }
}

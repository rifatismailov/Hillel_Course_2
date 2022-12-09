package homework_three.employees;

public class Employees {
    //2. Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
    private String name;
    private String position;
    private String email;
    private String tell;
    private  int age;
    public Employees(String name,String position,String email,String tell,int age){
        this.name=name;
        this.position=position;
        this.email=email;
        this.tell=tell;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+position+" "+email+" "+tell+" "+age;
    }
}

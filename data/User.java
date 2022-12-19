//Создать package – data. Работу продолжаем в нем
//        Реализовать абстрактный класс User и его наследники Student и Teacher.
//        Родитель имеет в себе общие данные (фио, год рождения, паспорт (серия номер),
//        а наследники собственные параметры (номер группы для Student, кафедра для Teacher).


package data;

 public abstract class User {
    public User(String fio, int age, int passport){
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }
    private String fio;
    private int age;
    private int passport;
    
}

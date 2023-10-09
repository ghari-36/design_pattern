package BuilderPattern;

import BuilderPattern.Helper;


public class student {
    private String name;
    private int age;
    private  String gender;
    private String univercityName;
    private String gradeYear;
    private double psp;
    private String address;

    public student(Helper helper){
        //validation
        if(helper.age>100){
            throw new IllegalArgumentException("Age cant be greater than 100");
        }
        this.name= helper.name;
        this.age= helper.age;
        this.univercityName= helper.univercityName;
        this.gender= helper.gender;
        this.gradeYear= helper.gradeYear;
    }

}

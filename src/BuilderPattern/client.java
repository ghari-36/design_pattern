package BuilderPattern;


public class client {
    public static void main(String[] args) {
        Helper helper=new Helper();
        helper.name="harimohan";
        helper.age=30;
        helper.univercityName="Scaler";
        student st=new student(helper);
        System.out.println("Debug");
    }
}

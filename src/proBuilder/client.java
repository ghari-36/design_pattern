package proBuilder;




public class client {
    public static void main(String[] args) {
       student st=student.getBuilder()
                         .setName("harimohan")
                         .setAge(30)
                         .setUnivercityName("Scaler")
                         .built();
        System.out.println("Debug");
    }
}

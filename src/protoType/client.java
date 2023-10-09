package protoType;

public class client {
    public static void fillRegistry(studentRegistry registry){
        student julyBatch=new student();
        julyBatch.setBatchName("july22");
        julyBatch.setAverageBatchPsp(90);
        julyBatch.setAge(30);
        registry.register("july22",julyBatch);

        student augBatch=new student();
        augBatch.setBatchName("aug22");
        augBatch.setAverageBatchPsp(95);
        augBatch.setAge(40);
        registry.register("aug22",augBatch);
    }

    public static void main(String[] args) {

        studentRegistry registry=new studentRegistry();
        fillRegistry(registry);


        student hari=registry.get("july22").clone();

        hari.setName("Hari");
        hari.setPsp(87);

        student mohan=registry.get("aug22").clone();

         mohan.setName("Mohan");
         mohan.setPsp(87);

        System.out.println("debug");
    }
}

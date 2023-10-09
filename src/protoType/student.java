package protoType;

public class student implements protoType<student>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    private double psp;
    private double averageBatchPsp;
    private String batchName;

    @Override
    public student clone() {
        student st=new student();
        st.name=this.name;
        st.age=this.age;
        st.psp=this.psp;
        st.averageBatchPsp=this.averageBatchPsp;
        st.batchName=this.batchName;
        return st;
    }
}

package proBuilder;



public class student {
    private String name;
    private int age;
    private  String gender;
    private String univercityName;
    private String gradeYear;
    private double psp;
    private String address;

    public student(Builder builder){
        //validation
        if(builder.getAge()>100){
            throw new IllegalArgumentException("Age cant be greater than 100");
        }
        this.name= builder.getName();
        this.age= builder.getAge();
        this.univercityName= builder.getUnivercityName();
        this.gender= builder.getGender();
        this.gradeYear= builder.getGradeYear();
    }
    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private  int age;



        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getUnivercityName() {
            return univercityName;
        }

        public Builder setUnivercityName(String univercityName) {
            this.univercityName = univercityName;
            return this;
        }

        public String getGradeYear() {
            return gradeYear;
        }

        public Builder setGradeYear(String gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        private  String gender;
        private  String univercityName;
        private  String gradeYear;
        private  double psp;
        private String address;

        public student built() {
            return new student(this);
        }
    }


}

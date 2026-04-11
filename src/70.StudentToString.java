 class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;



    public StudentToString(String name,int age,String rollNumber,String house){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: {name:"+name
                +", age:"+age
                +", roll Number:"+rollNumber
                +", house:"+house+" } ";
    }

    static void main() {
        StudentToString student = new StudentToString("Rohan",19,"001","Shivaji");
        System.out.println(student);

    }
}

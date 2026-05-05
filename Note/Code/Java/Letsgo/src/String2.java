class StudentExtended{
    private long studentID;
    private int classID;
    private String name;
    private String sex;
    private int age;
    public StudentExtended(long studentID, int classID, String name,
                   String sex, int age){
        this.studentID = studentID;
        this.classID = classID;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public long getStudentID(){
        return studentID;
    }
    public int getClassID(){
        return classID;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public void setStudentID(long studentID){
        this.studentID = studentID;
    }
    public void setClassID(int classID){
        this.classID = classID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public StudentExtended(){
    }
    public String toString(){
        return "学号："+getStudentID()+
                "\n班号："+getClassID()+
                "\n姓名："+getName()+
                "\n性别："+getSex()+
                "\n年龄："+getAge();
    }
}
public class String2{
    public static void main(String[] args){
        StudentExtended s1=new StudentExtended(90221,2,"Tom","male",20);
        StudentExtended s2=new StudentExtended();
        s2.setStudentID(90222);
        s2.setClassID(3);
        s2.setName("Alice");
        s2.setSex("female");
        s2.setAge(21);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
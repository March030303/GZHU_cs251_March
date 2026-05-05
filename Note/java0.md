# <center><span style="color:red">JAVA基础</span>
# <center>类型转换
### 1、自动类型转换
当把一个较小范围的类型赋值给一个较大范围的类型时，发生自动类型转换。
形式：
```
byte a1=2; 
byte a2=3; 
byte a=a1+a2;//错误
int a=a1+a2;//正确
```
<span style="color:red">注意：
1、表达式中，如果有一个变量是较大范围的类型，表达式的类型就是较大范围的类型。
2、a+=b等价于a=(a的类型)（a+b）</span>
## 2、强制类型转换
当把一个较大范围的类型赋值给一个较小范围的类型时，发生强制类型转换。
形式：数据类型 变量=(数据类型)变量
例子：
```
double a=2.5; 
int b=(int)a;
```
# <center>数组
## 数组的定义
### 1、静态数组
```

int[] arr3=new int[]{1,2,3};//方式一：声明、分配空间并赋值

int[] arr4={1,2,3};//方式一的语法糖
```
### 2、动态数组
```
int[] arr1=new int[10];//方式一：声明并分配空间

int[] arr2;//方式二：声明、分配空间
arr2=new int[10];//不赋值
```

## 数组的操作
 1、长度:arr.length()
 2、赋值:arr[i]=value
 3、取值:value=arr[i]
 4、直接==数组名.for==即可在idea遍历

 其实有时候不需要把所有数据存在数组中，如果是==找最大最小、求和==类似的问题，完全能用临时变量计算
# <center>方法
![](https://cdn.jsdelivr.net/gh/March030303/Picgo@main/img/20260502221125033.png)
这里报错是因为接口中并没有定义get方法，所以不能重写get方法。

## this关键字
1、当成员变量与形参名相同时，可以使用this关键字来区分。
```java
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
}
```
2、当构造方法中，有多个参数时，可以使用this关键字来调用其他构造方法。
```java
class StudentExtended{
public StudentExtended(long studentID, int classID, String name,
                   String sex, int age){
        this.studentID = studentID;
        this.classID = classID;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

public StudentExtended(long studentID, int classID, String name){
        this(studentID, classID, name, "男", 0);
    }
}
```
## super关键字
1、super关键字可以访问父类的成员变量，可以类比this的第二种用法
```java
class StudentExtended{
public StudentExtended(long studentID, int classID, String name,
                   String sex, int age){
        this.studentID = studentID;
        this.classID = classID;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
class StudentExtended2 extends StudentExtended{
    public StudentExtended2(long studentID, int classID, String name, String sex, int age){
        super(studentID, classID, name, sex, age);
    }
}
```

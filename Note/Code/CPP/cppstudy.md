## bool变量
true为非0，false为0  

## const常量  
const int Max=150//之后改变不了  

## string类  
|    定义     |  拼接   |                 输入                  |                          处理                           |
| :---------: | :-----: | :-----------------------------------: | :-----------------------------------------------------: |
| string s="" | s=s1+s2 | cin>>s<br>getline(cin,s) 可以输入一行 | s.lengeh()<br> s1=s.substr(n,m)<br>&&<br>s1=s.substr(n) |

## 引用&  
C++ 中 & 可以定义引用变量（别名），这是 C 没有的核心特性。引用本质是变量的 “只读别名”  
~~~// 该代码在 C 中编译报错（C 不认识引用语法），C++ 中正常运行
#include <iostream>
using namespace std;

// 形参是引用（int &b 等价于 变量a的别名）
void modify(int &b) {
    b = 200;  
 // 直接修改引用，等价于修改原变量a
}

int main() {
    int a = 20;
    int &ref = a; // 定义ref为a的引用（别名）
    cout << "a的值：" << a << endl;   // 输出 20
    cout << "ref的值：" << ref << endl; // 输出 20（和a共享内存）
    
    ref = 100; // 修改ref，a也会变
    cout << "修改ref后a的值：" << a << endl; // 输出 100
    
    modify(a); // 传递a（引用传参，无需取地址）
    cout << "函数修改后a的值：" << a << endl; // 输出 200
    return 0;
}  
~~~

# 竞赛前置  
**无穷大**：1e9、0x3f3f3f3f  
**迭代器**：  
int a[10];  
for(auto x:a) 拷贝    
for(const auto &x:a) 引用  
for(auto p=s.begin();p!=s.end();p++) 注意s.end是最后一个元素的下一个元素   
最后再cout<<x,或者cout<<*p  

**头文件**：#include<bits/stdc++.h>  
**强制类型转换**：int i=10;  double x=double(i)  
**输入输出**:scanf和printf会更好，输出小数时printf尤其好  
**暴力清空**:char a[10];menset(a,0,sizeof(a));
# 常用库函数  
### 初始化整个数组的值  
Const int N=100010;  
int h[N];  
menset(h,0,sizeof h);  
### 去重  
unique()//去除相邻的元素  

# 常用数据结构  

## 队列queue  

## 栈stack  

## 集合set  
### s.insert()：插入元素  
### s.find():查找元素，返回指针  
### s.erase():去除、擦去元素

## 键值对map  
### 创建:map<string,int> m  
### 添加:m["hello"]=3  
### 访问:cout<<m["hello"]=3  
### 遍历：迭代器  
### 获取长度:m.size()
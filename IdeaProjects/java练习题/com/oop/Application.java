package com.oop;
/*
 * 1.类与对象
 *   类是一个模板：抽象，对象是一个具体的实例
 * 2.方法
 *   定义 、调用！
 *
 * 3.对应的引用
 *   引用类型： 基本类型（8大基本类型）
 *   对象是通过引用来操作的：栈--->堆
 *
 * 4.属性:字段field 成员变量
 *   默认初始化：
 *           数字：0  0.0
 *           char：u0000
 *           boolean：false
 *           引用：null
 *
 *   修饰符 属性类型  属性名 = 属性值！
 *
 * 5.对象的创建 和使用
 *   -必须使用new 关键字创建对象，构造器 Person laoma = new Person();
 *   -对象的属性 laoma.name
 *   -对象的方法 laoma.slepp();
 *
 * 6.类：
 *   静态的属性     属性
 *   动态的行为     方法
 */
import com.oop.demo03.Pet;
//import com.oop.demo04.Student;
import com.oop.demo05.A;
import com.oop.demo05.B;
//import com.oop.demo05.Student;
import com.oop.demo05.Teacher;
import com.oop.demo06.Person;
import com.oop.demo06.Student;
import com.oop.demo10.Outer;

import java.io.ObjectOutputStream;

/*
    封装：
* 1.提高程序的安全性，保护数据
* 2.隐藏代码的实现细节
* 3.统一接口
* 4.系统可维护增加了
* */
public class Application {

    //静态的方法和非静态的方法有很大的区别
    //静态方法：方法的调用只和左边，定义的数据类型有关
    //非静态方法：重写
    public static void main(String[] args) {

//        A a = new A();
//        a.text();//A
//
//        //父类的引用指向了子类
//        B b = new A();//子类重写了父类的方法
//        b.text();


        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了：父类的引用指向子类

        //Student能调用的方法都是自己的或者继承父类的!
//        Student s1 = new Student();
//        //Person 父类，可以指向子类，但是不能调用子类独有的方法
//        Person s2 = new Student();
//        Object s3 = new Student();
//
//        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大！
//        s2.run();//子类重写了父类的方法，执行子类的方法
//        s1.eat();

        //类型之间的转换：父      子
//
//        //高                    低
//        Person obj = new Student();
//
//        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了！
//        ((Student) obj).go();
//
//        //子类转换为父类，可能丢失一些方法
//        Student student = new Student();
//        student.go();
//        Person person = student;

//        Outer outer = new Outer();
//
//        //通过这个外部类来实例化内部类
//        Outer.Inner inner = outer.new Inner();
//        inner.in();
//        inner.getID();

    }
}
/*
* 1.父类引用指向子类的对象
* 2.把子类转换为父类，向上转型
* 3.把父类转换为子类，向下转型，强制转换
* 4.方便方法的调用，减少重复的代码！
*/
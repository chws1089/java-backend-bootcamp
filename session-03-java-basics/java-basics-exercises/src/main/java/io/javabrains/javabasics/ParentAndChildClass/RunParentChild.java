package io.javabrains.javabasics.ParentAndChildClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RunParentChild {
//    static {
//        System.out.println("class loaded");
//    }
//
    public static void main(String[] args) {


//        ParentClass myClass1 = new ParentClass();
//        System.out.println("myClass1 = " + myClass1.add(1,2));
//
//        ParentClass myClass2 = new ChildClass();
//        System.out.println("myClass1 = " + myClass2.add(5,2));
//
//        ChildClass myClass3 = new ChildClass();
//        System.out.println("myClass3.add(10,20) = " + myClass3.add(10,20));

//        ParentClass myClass4 = new ChildClass();
//        myClass4.multiply();

//        ChildClass myClass5 = new ChildClass();
        ChildClass.NestClass nestClass = new ChildClass.NestClass();
//        System.out.println("static nestClass = " + nestClass.add(60,7.8));

        ChildClass myClass6 = new ChildClass();
        ChildClass.NestClass2 nestClass2 = myClass6.new NestClass2();
//        System.out.println("inner nestClass2 = " + nestClass2.add(60,7.8));

//        Field[] fields = nestClass.getClass().getDeclaredFields();
//        for (Field field : fields)
//            System.out.println(field.getType());



        Field[] fields = nestClass.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
            // Add more details if needed
        }
        
        Method[] methods = nestClass.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method name:" + method.getName());

        }

        Point point1 = new Point(3,5);
        Point point2 = new Point(3,5);
        System.out.println(point1.x());
        System.out.println(point1==point2);






    }
    }


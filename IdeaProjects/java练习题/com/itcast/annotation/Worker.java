package com.itcast.annotation;

@MyAnno(show1 = 1,per = Person.p1,anno2 = @MyAnno2,strs = "bbb")
public class Worker {
    @MyAnno3
    public String name = "aaa";

    public void show() {

    }

}

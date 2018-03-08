package com.brain.base;

/**
 * Created by biao.hu on 2017/9/21.
 */
class Employee
{
    private String name;
    private int age;

    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Employee))
            return false;

        Employee e = (Employee) o;
        return e.getName().equals(name) && e.getAge() == age;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }
}

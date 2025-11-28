package EqualsAndHashcode;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name =  name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;

        //age or name, if any of this matched then it will return true.
        if (p.age == this.age || p.name.equals(this.name)){
            return true;
            //if we want both to be matched, then we can replace the sign || to && in the if condition
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        //return Objects.hash(age, name);
        return Objects.hash(age);
        //return only based on age.
    }
}

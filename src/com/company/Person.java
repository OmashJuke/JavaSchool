package com.company;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public String GetSpouseName(){
        return spouse.name;
    }


    public boolean marry(Person person) {
        if (this.man && person.man) {
            return false;
        } else {
            if (isFamily(person)) {
                return false;
            } else {
                this.spouse=person;
                person.spouse=this;
                return true;
            }
        }


    }

    public boolean isFamily(Person person) {
        if (spouse==null) {
            return false;
        } else {
            if ((this==person.spouse) && (this.spouse==person)) {
                return true;
            } else {

                return false;
            }
        }
    }

    public boolean divorce() {
        if (spouse==null) {
            return false;
        } else {
            spouse.spouse = null;
            this.spouse = null;
            return true;
        }
    }


}

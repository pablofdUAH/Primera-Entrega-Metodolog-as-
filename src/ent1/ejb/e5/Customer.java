package ent1.ejb.e5;

public class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name,char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm'){
            this.gender='m';
        }else {
        this.gender = 'f';
        }
    }


    @Override
    public String toString(){
        return name +"("+id+")";
    }

}

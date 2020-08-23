package OOP;

public class Human {

    String name;
    String profession;
    String sex;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    void print() {
        System.out.println("Your name is: " + name); 
        System.out.println("Your Age is: " + age); 
        System.out.println("Your Profession is: " + profession); 
        System.out.println("Your Sex is: " + sex);     
    }

    public static void main(String[] args) {
        
        Human km = new Human();
        km.setAge(21);
        km.setName("Kamil");
        km.setProfession("Junior Developer");
        km.setSex("Yaxsi Oglan");
        km.print();
              
    }   
}

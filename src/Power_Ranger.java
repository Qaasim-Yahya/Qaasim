public class Power_Ranger {

    public class Power_Ranger {


        //Attribute Syntax = type + name + value;

        String color;
        String helmet;
        String weapon;
        int age;

        //constructor
        //Syntax of constructor = className + (pass attribute) + { this.attributeName = attributeName;}

        Power_Ranger (String color, String helmet, String weapon, int age) {
            this.color = color;
            this.helmet =helmet;
            this.weapon =weapon;
            this.age =age;
        }
    }
    //Syntax of method = return type + method Name + () + {}

//attack
//wear
//run

    void attack() { System.out.println("PowerRanger can shoot");}

    void wear() { System.out.println("PowerRanger can dress");}

    void run() { System.out.println("PowerRanger can move");}
}


}

// package Arrays_String_Class_objects;

class calculator{

    int num;

    public void show(){
        System.out.println("Inside class method " + num);
    }
}

public class class_object {
    public static void main(String[] args) {

        calculator cal = new calculator();
        cal.num = 10;

        cal.show();
        
    }
}

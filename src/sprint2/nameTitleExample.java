package sprint2;

public class nameTitleExample {
    public static void addTitle(String name, char gender){
        if(gender == 'F'){
            name = " Mrs. " + name;
        }
        else {
            name = " Mr. " + name;
        }
        System.out.println("Inside Method: " +name);
    }

    public static void main(String[] args){
        String name = "kiran";
        char  gender= 'F';
        System.out.println("Original name: " + name);
        addTitle(name, gender);
        System.out.println("name after method call: " + name);
    }
}

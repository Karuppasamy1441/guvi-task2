public class person {

    String name;
    int age=18;
    public void display(){
        System.out.println("Name :"+name);
        System.out.print("Age :"+age);
    }
    public static void main(String[] args){
        person obj=new person();
        obj.name="Ram";
//        obj.age=50;
        obj.display();
    }
}

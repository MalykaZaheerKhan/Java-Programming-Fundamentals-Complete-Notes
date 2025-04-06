public class Animal{
    public void eat()
    {
        System.out.println("it is eating");
    }
    public void run()
    {
        System.out.println("it is running");
    }
    public static void main(String [] args){
        System.out.println(1);
//        Animal rabbit=new Animal();
        Animal rabbit;
        rabbit=new Animal();
        rabbit.eat();
        rabbit.run();

        Animal fox=new Animal();
        fox.run();
        fox.eat();


        Birds sparrow=new Birds();
        sparrow.fly();
    }
}
 class  Birds extends Animal{
    public void fly()
    {
        System.out.println("Only birds can fly");
    }
}



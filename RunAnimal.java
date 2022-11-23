import java.util.*;
public class RunAnimal{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            Bird b = new Bird();
            Cat c = new Cat();
            Dog d = new Dog();
           
            System.out.print("Choose an Animal. Press B for Bird, C for cat, D for Dog:");
            String input1 = sc.nextLine();
      
            if (input1.equalsIgnoreCase("B")){
                b.eat();
                b.sleep();
                b.makeSound();
            }
            else if (input1.equalsIgnoreCase("C")){
                c.eat();
                c.sleep();
                c.makeSound();
            }
            else if (input1.equalsIgnoreCase("D")){
                d.eat();
                d.sleep();
                d.makeSound();
   }
}    
}
}
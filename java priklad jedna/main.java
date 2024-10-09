import java.util.Scanner;
 
class main{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Máš rád krysy?");
    System.out.println("");
    System.out.println("1. ANO");
    System.out.println("2. NE");
    String line = sc.nextLine();
    

 
   
    if(line.equals("1")){
        System.out.println("Tak to si skvělý člověk taky je mám rád");
    }
    


    if(line.equals("2")){
        System.out.println("Dobře nevadí");
    }
    
   
}
 
}
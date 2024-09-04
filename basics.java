//This tutorial is featuring java programming language basics

/*
class program {
  public static void main (String[] Args) {
    System.out.println("Dev");
  }
}




// Datatypes in java
class numbers {
  public static void main(String[] Args) {
    int num;
    String str;
    float point;
    boolean bool;
    char letter;
    
    
    num = 56;
    str = "Dev";
    point = 7.8f;
    bool = true;
    letter = 'D';
    
    
    
    System.out.println(num);
    System.out.println(str);
    System.out.println(point);
    System.out.println(bool);
    System.out.println(letter);
  }
}



  
class add {
  public static void main(String[] args) {
    
    
    int num1;
    int num2;
    
    
    num1 = 67;
    num2 = 78;
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    
    
  }
}
  

  
// Taking input from user


import java.util.Scanner;


class input {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Value:" +num);
  }
    
  
}


  
  
// conditions in java


import java.util.Scanner;

class evenodd {
  public static void main(String [] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer");
    
    x = sc.nextInt();
    if(x%2 == 0) {
      System.out.println("Number is even");
    }
    else{
      System.out.println("Number is odd");
      
    }
      
    
  }
}



  

// swapping variables

import java.util.Scanner;

class program {
  public static void main(String[] args) {
    int x;
    int y;
    int temp;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the value of x and y\n");
    x = sc.nextInt();
    y = sc.nextInt();
    
    System.out.println("Before swapping\n x="+ x+"\ny="+y);
    
    temp = x;
    x = y;
    y = temp;
    
    System.out.println("After swapping\n x="+x+"\n y="+y);
  }
}



// Loops in java


import java.util.Scanner;
class loop {
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int limit = sc.nextInt();
    for(int i = 1; i<= limit; i++)
    System.out.println(i);
  }
}
  
  

  

//Beginning Object Oriented Programming

public class Main {
  int x = 5;
  
  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println(obj.x);
  }
}


   
// Inheritance



class Super_class
{
  int a = 280;
  void Display_Super()
  {
    System.out.println("Display on super class: " +a);
  }
}

class Sub_class extends Super_class {
  void Display_Sub()
{
System.out.println("Display on sub class:" + a);
}
}
class SingleInheritance{
  public static void main (String Args[]) {
    Sub_class sub1= new Sub_class();
    sub1.Display_Super();
    sub1.Display_Sub();
  }
}
  

  
  
  
// Polymorphism
// Polymorphism statest that many classes linked to each other by inheritance


class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}


class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says:wee wee");
  }
}

class Dog extends Animal {
  public void mainSound() {
    System.out.println("The dog saya: bow bow");
  }
}



class Main{
  public static void main(String [] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    
    
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}




  
  
import java.util.Scanner;
class votingApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    
    int x = sc.nextInt();
    if(x > 18 ) {
      System.out.println("You are eligible to vote");
    }
    
    else{
      System.out.println("Go and study mathematics ");
    }
    
  }
}

  
  
  
import java.util.Scanner;

class app {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int x = sc.nextInt();
    if (x % 2 == 0) {
      System.out.println("The number is less than 50");
    }
    
    else if(x % 2 == 1) {
      System.out.println("The value is greater than 50");
    }
    
    else{
      System.out.println("Invalid input");
    }
      
    }
  }

*/
  
  
  
*/
  
  
  // This basic java tutorial includes some basic java operations
  //Java syntax
  //Java DataTypes
  //Java Operators
  //Java Structures
  //Java Conditions
  //Java Loops
  //Java OOPS
  
  // This code is contributed by Dev Kumar
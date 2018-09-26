/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author admin
 */
public class Lab3 {
 
    public void ucln(int a, int b){   
	if(a<0)a=0-a;
	if(b<0)b=0-b;
	while(a!=b){
		if(a>b)a=a-b;
		if(a<b)b=b-a;
	}
	System.out.println(a);
    }
    public void fibonaxi(int n){
	int a=1;
	int b=1;
	int sum=0;
	for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
	}
	System.out.println(sum);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //test Ex1
        System.out.println("test Ex1");
        Lab3 main = new Lab3();
	main.ucln(-15,6);
	main.fibonaxi(5);
        
        //test Ex2
        System.out.println("test Ex2");
        PS s1=new PS();
        s1.setts(4);
        s1.setms(5);
        PS s2=new PS();
        s2.setts(7);
        s2.setms(6);
        
        s1.cong(s2);
        s1.tru(s2);
        s1.nhan(s2);
        s1.chia(s2);
        
        System.out.println(s2.equals(s1));
        
        //test Ex3
        System.out.println("test Ex3");
        Dog dog= new Dog();
        dog.setname("Bege");
        dog.setsize("Small");
        dog.go();
        
        Cat cat=new Cat();
        cat.setname("Hien Duong");
        cat.setsize("Big");
        cat.go();
        
        Baby baby=new Baby();
        baby.setname("Tit");
        baby.go();
        
        Bird bird=new Bird();
        bird.setname("Se");
        bird.setsize("Big");
        bird.go();
        
        Rabbit rabbit=new Rabbit();
        chiken.setname("Ronaldo");
        chiken.setsize("Small");
        chiken.go();
        
        Dinosaurs dinosaurs=new Dinosaurs();
        dinosaurs.setname("Drink-Water");
        dinosaurs.setsize("Super large");
        dinosaurs.go();
        
        Mouse mouse=new Mouse();
        mouse.setname("Peter");
        mouse.setsize("Small");
        mouse.go();
        
        Human human=new Human();
        human.setname("Nam");
        human.setsize("Big");
        human.go();
        
        Ostrich ostrich=new Ostrich();
        ostrich.setname("ti");
        ostrich.setsize("Big");
        ostrich.go();
        
        Owl owl=new Owl();
        owl.setname("Tony");
        owl.setsize("Small");
        owl.go();
    }
}

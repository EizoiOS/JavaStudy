/*
多态：可以理解为事物存在的多种体现形态。

人：男人，女人

动物：猫，狗

猫 x = new 猫();

动物 x = new 猫();

1.多态的基本体现
	父类的引用指向了自己的子类对象。(多态的代码体现形式)
	父类的引用也可以接受自己的子类对象。

2.多态的前提
	必须是类与类之间有关系，要么继承，要么实现。
	通常还有一个前提：存在覆盖。

3.多态的好处：
	多态的出现大大的提高了程序的扩展性。

4.多态的弊端：
	提高了扩展性，但是只能使用父类的引用访问父类中的成员。

5.多态的应用

6.多态的出现在代码中的特点(多态使用的注意事项)

 */

/*
动物，
猫，狗。
 */

abstract class Animal {

	public abstract void eat();
}

class Cat extends Animal {

	public void eat(){
		System.out.println("吃鱼");
	}

	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {

	public void eat(){
		System.out.println("吃骨头");
	}

	public void seeHome(){
		System.out.println("看家");
	}
}

class Pig extends Animal {

	public void eat(){
		System.out.println("吃饲料");
	}

	public void gongDi(){
		System.out.println("拱地");
	}
}

class DuoTaiDemo {

	public static void main(String[] args){

		// System.out.println("Hello World!");

		// Cat c = new Cat();
		// c.eat();

		// Dog d = new Dog();
		// d.eat();

		// Cat c = new Cat();
		// function(c);	

		// Dog d = new Dog();
		// function(d);

		// Pig p = new Pig();
		// function(p);

		// Animal c = new Cat(); // 一个对象具备了多种形态
		// function(c);

		function(new Cat());
		function(new Dog());
		function(new Pig());

	}

	public static void function(Animal a){ // Animal c = new Cat(); 
		a.eat();
	}

	// public static void function(Cat c){
	// 	c.eat();
	// }

	// public static void function(Dog d){
	// 	d.eat();
	// }

	// public static void function(Pig p){
	// 	p.eat();
	// }
}


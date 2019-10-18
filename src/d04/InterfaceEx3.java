package d04;
/*
 클래스 설계
 Animal 
 Insect
 Bird 
 Butterfly
 Ant
 Dog
 
 -animal		- Bird
 				- Dog
 -Insect 		- Butterfly
		 		- Ant
 implement 
 
 */

interface Flyable{
	void fly();
}

interface Walkable{
	void walk();
}
class animal_ {
	
}

class Insect {
	
}

class Dog_ extends animal_ implements Walkable {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bird extends animal_ implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Butterfly extends Insect implements Flyable		{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Ant extends Insect implements Walkable{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceEx3 {


}

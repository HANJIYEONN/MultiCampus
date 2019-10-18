package d04;

public class Car {
	public int speed;
	public int geer;
	public String color;
	
	public void setGeer(int geer) {
		this.geer = geer;
	}
	
	public void speedUp(int increasement) {
		speed += increasement;
	}
	
	public void speedDown(int increasement) {
		speed -= increasement;
	}


	@Override
	public String toString() {
		return "Car [speed=" + speed + ", geer=" + geer + ", color=" + color + "]";
	}


}

package Animal;

public class cat extends animal{
	public void sound(){
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal obj = new cat();
		obj.sound();
	}

}

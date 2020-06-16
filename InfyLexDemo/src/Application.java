
public class Application {
	public Application() {
		System.out.println("inside Constructor");
	}
	public void myDrawMethod() {
		System.out.println("inside Method");
	}
	
	public static void main(String[] args) {
		/*Shape shape = new Triangle();
		shape.draw();
		Shape shape1 = new Circle();
		shape1.draw();*/
		
		Application app = new Application();
		app.myDrawMethod();
		/*Application app1 = new Application();
		System.out.println(app == app1);
		System.out.println(app.equals(app1)+""+app1+""+app);*/
	}

}

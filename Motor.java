public class Motor
{
	private String color;
	private MotorEngine engine;
	private Brake brake;
	
	public Motor(String color){
		this.color = color;
		engine = new MotorEngine();
		brake = new Brake();
	}
	public void setColor(String color){
		this.color = color;
	}
	public String start() {
		return engine.startMotorEngine();
	}
}


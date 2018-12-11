
public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String inputName,int inputEyes,String inputColor,String inputMaster){
		this.name = inputName;
		this.eyes = inputEyes;
		this.color = inputColor;
		this.master = inputMaster;
	}
	
	void setMaster(String masterName) {
		this.master = masterName;
	}
	
	public String getMaster() {
		return this.master;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEyes() {
		return this.eyes;
	}
	
	public String getColor() {
		return this.color;
	}
	
}

package day49_inheritance002;
			//super
public class ANIMAL {
	
	private String type;
	public ANIMAL() {
		System.out.println("Animal Constructor");
		type = "undefined";
	}
		public ANIMAL(String type) {
			System.out.println("Animal 1 - arg constructor");
			this.type = type;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ANIMAL [type=" + type + "]";
	}
	
		
}

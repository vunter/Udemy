package unidade3;

public class Generico<t>{
	
	t obj;

	public Generico(t obj) {
		super();
		this.obj = obj;
	}

	public t getObj() {
		return obj;
	}

	public void setObj(t obj) {
		this.obj = obj;
	}

	public void showType() {
		System.out.println("Tipo " + obj.getClass().getName());
	}
	
	
	
}

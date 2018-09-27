package unidade3;

public class TesteGenerico {

	public static void main(String[] args) {
		Generico<Integer> g = new Generico<>(1);
		System.out.println(g.getObj());
		g.showType();
		Generico<String> g1 = new Generico<>("_");
		System.out.println(g1.getObj());
		g1.showType();
		int t = 0;
		for(int i=0; i < 10; i++) {
			
			t += i + g.getObj();
			System.out.println(t);
		}
	}

}

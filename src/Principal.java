
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valor v = new Valor();
		System.out.println(v.ins(5));
		System.out.println(v.ins(12));
		System.out.println(v.ins(24));
		System.out.println(v.ins(33));
		System.out.println(v.ins(4));
		System.out.println(v.ins(12));
		System.out.println(v.ins(24));
		System.out.println(v.ins(33));
		System.out.println(v.ins(4));
		System.out.println(v.ins(33));
		System.out.println(v.ins(4));
		System.out.println("Valor removido " + v.del(1));
		System.out.println("Valor removido " + v.del(0));
		//v.print();
		System.out.println(v.size());
	}

}

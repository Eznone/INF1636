import lista. *;

public class Pilha {
	private Lista lst;
	
	
	public void push(Object x) {
		lst.insFin(x);
	}
	
	public Object pop() {
		return (lst.retFin());
	}
	
	public boolean vazio() {
		return lst.vazio();
	}
}

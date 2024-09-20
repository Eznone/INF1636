package Lista;

class No {
	private Object elem;
	private No prox;
	
	public No(Object e,No p) {
		elem=e;
		prox=p;
	}
	
	public Object getElem() {
		return elem;
	}
	
	public No getProx() {
		return prox;
	}
	
	public void setProx(No o) {
		prox=o;
	}
}
package Lista;

import Lista.*;

class NovaPilha extends Lista implements Pilha {
	public Object pop() {
		return retIni();
	}
	
	public void push(Object o) {
		insIni(o);
	}
	
	public boolean empty() {
		return vazio();
	}
	
	NovaPilha() {
	}
}
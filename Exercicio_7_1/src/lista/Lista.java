package lista;

public class Lista {
	private int tam=0;
	private No ini=null;
	private No fin=null;
	private No corr=null;
	
	public boolean vazio() {
		return tam==0 ? true:false;
	}
	
	public void insIni(Object x) {
		No aux=new No(x,ini);
		ini=aux;
		if(tam==0)
			fin=ini;
		tam++;
	}
	
	public void insFin(Object x) {
		if(tam==0) {
			insIni(x);
			return;
		}
		
		No ult=new No(x,null);
		fin.setProx(ult);
		fin=ult;
		tam++;
	}
	
	public Object retIni() {
		if(tam==0)
			return null;
		
		Object elem=ini.getElem();
		ini=ini.getProx();
		tam--;
		if(tam==0)
			fin=null;
		return elem;
	}
	
	public Object retFin() {
		if(tam==0)
			return null;
		else
			if(tam==1) {
				Object elem=ini.getElem();
				ini=fin=null;
				tam=0;
				return elem;
			}
		
		No p=ini,ant=null;
		
		while(p!=fin) {
			ant=p;
			p=p.getProx();
		}
		
		Object elem=p.getElem();
		ant.setProx(null);
		tam--;
		fin=ant;
		return elem;
	}
	
	public void posIni() {
		corr=ini;
	}
		
	public Object prox() {
		if(corr==null)
			return null;
		
		Object o=corr.getElem();
		corr=corr.getProx();
		return o;
	}	
	
	public Object returnElem() {
		return (corr.getElem());
	}
}

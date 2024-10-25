package projeto2;

public class No_de_cadeira extends Cadeira{
	Professor professor=new Professor();
	private No_de_cadeira ant;
	private No_de_cadeira prox;
	
	public No_de_cadeira getAnt() {
		return ant;
	}
	public void setAnt(No_de_cadeira ant) {
		this.ant = ant;
	}
	public No_de_cadeira getProx() {
		return prox;
	}
	public void setProx(No_de_cadeira prox) {
		this.prox = prox;
	}
	
	
	
}

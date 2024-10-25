package projeto2;

import java.util.Scanner;

public class Cadeiras {
	public static Scanner leitor=new Scanner(System.in);
	No_de_cadeira lista_de_cadeiras=null;
	
	
	public void cadastrar_curso(String nome,String categoria) {
		No_de_cadeira novo=new No_de_cadeira();
		novo.setNome(nome);
		novo.setCategoria(categoria);
		novo.professor.cadastrar_pessoa();
		novo.setAnt(null);
		novo.setProx(null);
		if(lista_de_cadeiras==null) {
			lista_de_cadeiras=novo;
		}
		else {
			No_de_cadeira aux=lista_de_cadeiras;
			while(aux.getProx()!=null) {
				aux=aux.getProx();
			}
			aux.setProx(novo);
			novo.setAnt(aux);
		}
	}
	
	public void cadastrar_cursos() {
		String cadeira=" ";
		String categoria=" ";
		while(!cadeira.equalsIgnoreCase("fim")) {
			System.out.print("digite o nome da cadeira que deseja cadastrar: ");
			cadeira=leitor.next();
			if(!cadeira.equalsIgnoreCase("fim")) {
				System.out.print("digite a qual categoria ela segue: ");
				categoria=leitor.next();
				this.cadastrar_curso(cadeira,categoria);
			}
		}
	}
	
	public void imprimir_cursos() {
		No_de_cadeira aux=lista_de_cadeiras;
		while(aux!=null) {
			if(aux.professor.getSexualidade().equalsIgnoreCase("masculino")) {
				System.out.println("a cadeira "+aux.getNome()+" sera ministrada pelo professor "+ aux.professor.getNome());
			}
			else {
				System.out.println("a cadeira "+aux.getNome()+" sera ministrada pela professora "+ aux.professor.getNome());
			}
			aux=aux.getProx();
		}
	}
	
}

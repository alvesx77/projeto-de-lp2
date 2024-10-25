package projeto2;
import java.util.Scanner;
public class Professor extends Pessoa implements Metodos{
	
	public static Scanner leitor=new Scanner(System.in);
	
	@Override
	public void cadastrar_pessoa() {
		 String nome,sexualida;
		 int idade;
		System.out.print("digite o nome do professor: ");
		nome=leitor.next();
		System.out.print("digite a idade do professor: ");
		idade=leitor.nextInt();
		System.out.print("digite a sexualidade ");
		sexualida=leitor.next();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexualidade(sexualida);
	}
}

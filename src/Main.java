import com.apple.Telefone;

public class Main {
	public static void main(String[] args) {
		Telefone telefone = new Telefone();
		
		telefone.getNavegador().adicionarAba("Tesla");
		System.out.println(telefone.getNavegador().exibirAba("Tesla"));
		
		
		
	}
}

package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Júnior");
		felipe.setIdade(12);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() 
				+ " tem " + felipe.getIdade() + " anos de idade"
				+ " e pertence ao sexo " + felipe.getSexo());
	}
}

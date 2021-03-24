package curso.testealuno;

import curso.classes.Aluno;

public class MainTestAluno {

	public static void main(String[] args) {
		Aluno aluno1; //objeto ainda nao existe na memoria
		Aluno aluno2 = new Aluno(); //objeto agora existe na memoria com construtor vazio -> instancia da classe
		Aluno aluno3 = new Aluno("Maria", 21); //objeto em memoria com construtor de dois parametros -> instancia da classe

		System.out.println(aluno3.getNome());
		
		Aluno alunoNotas = new Aluno();
		alunoNotas.setNome("Teste Notas");
		double [] notas = {9.8, 7.6, 8.3, 5.9};
		alunoNotas.setNotas(notas);
		
		System.out.println(alunoNotas.getMediaNota(notas));
	}

}

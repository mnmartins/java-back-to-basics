package curso.classes;

import java.time.LocalDate;

public class Aluno {
	//ATRIBUTES - com modificadores de acesso private por padrão
	String nome;
	int idade;
	//String dataNascimento;
	LocalDate dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	//String dataMatricula;
	LocalDate dataMatricula; //year-month-day -> 2021-12-23
	String instituicaoEnsino;
	String serieMatriculado;
	double [] notas;
	
	//CONSTRUCTORS
	public Aluno() {
		
	}
	
	public Aluno (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno (String nome, double [] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public Aluno(String nome, int idade, LocalDate dataNascimento, String registroGeral, String numeroCpf,
			String nomeMae, String nomePai, LocalDate dataMatricula, String instituicaoEnsino,
			String serieMatriculado, double [] notas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataMatricula = dataMatricula;
		this.instituicaoEnsino = instituicaoEnsino;
		this.serieMatriculado = serieMatriculado;
		this.notas = notas;
	}

	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	//OTHER METHODS
	public double getMediaNota(double [] notas) {
		double mediaNotas;
		double somatorio = 0.0;
		for (int i = 0; i < notas.length; i++) {
			somatorio += notas[i];
		}
		mediaNotas = somatorio/4;
		
		return mediaNotas;
	}
	
}
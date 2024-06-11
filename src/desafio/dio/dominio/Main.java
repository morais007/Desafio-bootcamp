package desafio.dio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Devs dev1 = new Devs();
		dev1.setNome("Camila");
		dev1.InscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila: " + dev1.getConteudosInscritos());
		System.out.println("-");
		
		System.out.println("-----------------------");
		
		Devs dev2 = new Devs();
		dev2.setNome("João");
		dev2.InscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João: " + dev2.getConteudosInscritos());
		System.out.println("-");
	
		


	}

}

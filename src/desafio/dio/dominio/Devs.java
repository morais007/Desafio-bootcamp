package desafio.dio.dominio;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> contedosConcluidos = new LinkedHashSet<>();
	private Object conteudosCocluidos;
	private Object conteudosConcluidos;
	
	public void InscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevcInscritos().add(this);
	}
	
	public void Progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(Conteudo.isPresent()) {
			this.contedosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("Você não está matriculado e nenhum coteuso!");
		}
	}
	
	public double CalcularTotalXp() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.CalcularXp()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getContedosConcluidos() {
		return contedosConcluidos;
	}

	public void setContedosConcluidos(Set<Conteudo> contedosConcluidos) {
		this.contedosConcluidos = contedosConcluidos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(contedosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devs other = (Devs) obj;
		return Objects.equals(contedosConcluidos, other.contedosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
}

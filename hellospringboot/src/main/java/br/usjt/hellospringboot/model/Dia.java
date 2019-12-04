package br.usjt.hellospringboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table (name="dias")
@ToString @Getter @Setter
public class Dia {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	
	private String semana;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSemana() {
		return semana;
	}



	public void setSemana(String semana) {
		this.semana = semana;
	}



	public Tempo getTempo() {
		return tempo;
	}



	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}



	@OneToOne(optional=true, cascade = {CascadeType.ALL})
	@JoinColumn (name="previsao")
	private Tempo tempo;

}

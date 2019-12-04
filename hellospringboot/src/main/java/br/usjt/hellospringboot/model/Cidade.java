package br.usjt.hellospringboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table (name="cidades")
@ToString @Getter @Setter
public class Cidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	
	private String nome;
	
	private Double latitude;
	
	private Double longitude;
	
	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Double getLatitude() {
		return latitude;
	}




	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}




	public Double getLongitude() {
		return longitude;
	}




	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}




	public List<Tempo> getTempos() {
		return tempos;
	}




	public void setTempos(List<Tempo> tempos) {
		this.tempos = tempos;
	}




	@OneToMany (mappedBy="cidade", cascade = {CascadeType.ALL})
	private List<Tempo> tempos = new ArrayList<>();
	

}

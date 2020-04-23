package jpaModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Proposition implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date dateDebut;
	private Date dateFin;
	private String batiment;
	private boolean pauseDej;
	private boolean propositionAcceptee;
	
	@ManyToOne()
	private SondageReunion sondageReunion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getBatiment() {
		return batiment;
	}
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}
	public boolean isPauseDej() {
		return pauseDej;
	}
	public void setPauseDej(boolean pauseDej) {
		this.pauseDej = pauseDej;
	}
	public boolean isPropositionAcceptee() {
		return propositionAcceptee;
	}
	public void setPropositionAcceptee(boolean propositionAcceptee) {
		this.propositionAcceptee = propositionAcceptee;
	}
	

}

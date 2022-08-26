package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Override
	public String toString() {
		return "LigneConsultation [id=" + id + ", consultation=" + consultation + ", traitement=" + traitement
				+ ", posologie=" + posologie + ", unite_temps=" + unite_temps + ", quantite=" + quantite + "]";
	}
	@ManyToOne()
    @JoinColumn(name = "id_consultation", nullable = false)
	private Consultation consultation;
    
    
    @ManyToOne()
    @JoinColumn(name = "id_traitement", nullable = false)
	private Traitement traitement;
    
    
 //   @OneToMany(mappedBy = "ligne_consultation")
 //   private List<Traitement> traitement = new ArrayList<>();
	
    @Column(name = "posologie", nullable = false, length = 255)
	private String posologie;
    
    @Column(name = "unite_temps", nullable = false, length = 255)
    
	private String unite_temps;
    
    @Column(name = "quantite", nullable = false, length = 255)
	private String quantite;
	
	
	
	public LigneConsultation() {

	}     
    
	public LigneConsultation(int id, Consultation consultation, Traitement traitement, String posologie, String unite_temps,
			String quantite) {
		super();
		this.id = id;
		this.consultation = consultation;
		this.traitement = traitement;
		this.posologie = posologie;
		this.unite_temps = unite_temps;
		this.quantite = quantite;
	} 
    
    
    
	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}
	public Traitement getTraitement() {
		return traitement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Consultation getId_consultation() {
		return consultation;
	}
	public void setId_consultation(Consultation id_consultation) {
		this.consultation = id_consultation;
	}

	
	public String getPosologie() {
		return posologie;
	}
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	public String getUnite_temps() {
		return unite_temps;
	}
	public void setUnite_temps(String unite_temps) {
		this.unite_temps = unite_temps;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	

	
}
